public class SinglyLinkedDeque<ItemType> implements Deque<ItemType> {
    // private helper classes
    private class Node {
        ItemType data;
        Node next;
    }

    // fields
    private Node head;
    private int size;

    /**
     * Constructor: creates an empty deque of size 0
     */
    public SinglyLinkedDeque() {
        head = null;
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
        if(size ==0) {
            head.data = item;
            head.next = null;
        }
        // consider the case of adding to a non-empty list
        else {
            Node newFirst = new Node();
            newFirst.data = item;
            newFirst.next = head;
        }
        size++;
    }

    /**
     * Adds an item to the back of the deque.
     *
     * @param item item to be added
     */
    @Override
    public void addLast(ItemType item) {
        // consider the case of adding to an empty list
        if(size ==0) {
            head.data = item;
            head.next = null;
        }
        // consider the case of adding to a non-empty list
        else {
            Node newLast = new Node();
            while (head.data != null) {


            }

        } size++;
    }


    /**
     * Remove and return the item from the front, does nothing if empty.
     *
     * @return item at the front that was just removed, or null if empty
     */
    @Override
    public ItemType removeFirst() {
        // check if empty
        // if empty: do nothing and return null
        if(size == 0) {
            return null;
        }
        // if there's only one item: is this a special case?
        else if (size == 1) {
            head = null;
        }
        // if not empty:
        // 0. figure out a way to access the item in the front
        // 1. make a variable to save a copy of the item at the front
        // 2. remove the item at the front
        // 3. return the variable that has the saved copy of the item at the front
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
                current.next = current.next.next;
            }

        }
        size --;
        return null;
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

        if(size == 0) {
            return null;
        }
        // if there's only one item: is this a special case?
        else if (size == 1) {
            head = null;
        }

        // if not empty, has more than one item:
        // 0. figure out a way to access the item in the back
        // 1. make a variable to save a copy of the item at the back
        // 2. remove the item at the back
        // 3. return the variable that has the saved copy of the item at the back
        else {
            Node current = head;
            while (current.data != null) {
                current.next = current;
                current = current.next ;
            }
        }

        size --;
        return null;
    }

    public String toString() {
        String result = "";
        Node current = head;
        while (current!=null) {
            result += current.data + " ";
            current = current.next;
        }
        return result;
    }

}
