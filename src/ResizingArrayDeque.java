import java.util.Arrays;

/**
 * This class was created by Ken Hang, four methods addFirst, addLast, removeFirst,
 * and removeLast were implemented by Paul with interfaces by Ken.
 *
 * @author Paul Woods, Ken Hang
 */
public class ResizingArrayDeque<ItemType> implements Deque<ItemType> {
    // constants
    public static int DEFAULT_CAPACITY = 10;

    // fields
    private ItemType[] data;
    private int size;

    /**
     * Constructor: creates an empty deque of size 0
     */
    public ResizingArrayDeque() {
        data = (ItemType[])new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Return the number of items in the deque
     *
     * @return number of items in the deque
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Adds an item to the front of the deque.
     *
     * @param item item to be added
     */
    @Override
    public void addFirst(ItemType item) {
        // Properties/Methods: DEFAULT_CAPACITY = 10, ItemType[] data, int size, checkSize()

        // Check size of underlying array, increase if necessary
        checkSize();

        // reposition all elements one place up
        for (int i = size; i > 0; i--) {
            data[i] = data[i-1];
        }

        // assign new data to data[0], as that has been moved to data[1]
        data[0] = item;

        ++size;
    }

    /**
     * Adds an item to the back of the deque.
     *
     * @param item item to be added
     */
    @Override
    public void addLast(ItemType item) {
        checkSize();

        data[size++] = item;
    }

    /**
     * Remove and return the item from the front, does nothing if empty.
     *
     * @return item at the front that was just removed, or null if empty
     */
    @Override
    public ItemType removeFirst() {

        // if empty: do nothing and return null
        if (size == 0) {
            return null;
        }

        // non-empty, save 1st element, and shift all others down 1 place
        ItemType item = data[0];
        for (int i = 0; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        --size;

        // return 1st element that was saved
        return item;
    }

    /**
     * Remove and return the item from the back, does nothing if empty.
     *
     * @return item at the back that was just removed, or null if empty
     */
    @Override
    public ItemType removeLast() {

        // if empty: do nothing and return null
        if (size == 0) {
            return null;
        }

        ItemType item = data[size-1];
        data[size-1] = null;

        --size;

        return item;
    }

    // helper method to check to see if the size has reached the capacity
    // and more space needs to be allocated (creates a new larger array
    // and copies items over)
    private void checkSize() {
        if (size == data.length) {
            // resize up (double up the array size)

            // Step 1 - create a new larger array
            ItemType[] temp = (ItemType[]) new Object[size * 2];

            // Step 2 - copy items from data to temp
            for (int i = 0; i < size; i++) {
                temp[i] = data[i];
            }

            // Step 3 - repoint/refererence data to point to new array
            data = temp;

            // Optional:
            temp = null;
        } // end of if (need to resize)
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s += data[i];
            if (i < size-1)
                s += ", ";
        }
        return s;
    }
}
