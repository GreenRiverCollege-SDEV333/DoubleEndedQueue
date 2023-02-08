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
        // consider the case of adding to an empty list
        if (size == 0) {
            data[0] = item;
            size++;
        }else { // consider the case of adding to a non empty list
            // check if the array needs to be resized
            checkSize();
            // loop from the back of the array to the front
            for(int i=size-1; i>=0; i--) {
                // set the next index to the current index
                data[i+1] = data[i];
            }
            // set the first index to the item
            data[0] = item;
            size++;
        }

        // There is a private helper method checkSize() defined below to check/resize
        // that you can call as needed to check if the array is full and resize it.
    }

    /**
     * Adds an item to the back of the deque.
     *
     * @param item item to be added
     */
    @Override
    public void addLast(ItemType item) {
        // consider the case of adding to an empty list
        if (size == 0) {
            data[0] = item;
            size++;
        } else { // consider the case of adding to a non-empty list
            // check for a resize
            checkSize();
            // set the last (empty) index to the item
            data[size] = item;
            size++;
        }

        // There is a private helper method checkSize() defined below to check/resize
        // that you can call as needed to check if the array is full and resize it.
    }

    /**
     * Remove and return the item from the front, does nothing if empty.
     *
     * @return item at the front that was just removed, or null if empty
     */
    @Override
    public ItemType removeFirst() {
        // check if empty
        if (size == 0) {
            // if empty: do nothing and return null
            return null;
        } else if (size == 1) {// if there's only one item: is this a special case?
            ItemType removed = data[0];
            data[0] = null;
            size--;
            return removed;
        } else {// if not empty:
            // 0. figure out a way to access the item in the front
            ItemType removed = data[0];
            // 1. make a variable to save a copy of the item at the front
            // 2. remove the item at the front
            for (int i=0; i<size; i++) {
                //shift all items in the array back one index
                data[i] = data[i+1];
            }
            size--;
            // 3. return the variable that has the saved copy of the item at the front
            return removed;
        }
    }

    /**
     * Remove and return the item from the back, does nothing if empty.
     *
     * @return item at the back that was just removed, or null if empty
     */
    @Override
    public ItemType removeLast() {
        // check if empty
        // if empty: do nothing and return null
        if (size == 0) {
            return null;
        } else if (size == 1) {// if there's only one item: is this a special case?
            ItemType removed = data[0];
            data[0] = null;
            size--;
            return removed;
        } else { // if not empty, has more than one item:
            // 0. figure out a way to access the item in the back
            // 1. make a variable to save a copy of the item at the back
            ItemType removed = data[size-1];
            // 2. remove the item at the back
            data[size-1] = null;
            size--;
            // 3. return the variable that has the saved copy of the item at the back
            return removed;
        }
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

    public String toString() {
        String result = "";
        for (int i=0; i<size; i++) {
            result += data[i] + " ";
        }
        return result;
    }
}
