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
        if (size == 0) {
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;
            head = newNode;
            size++;
        } else {// consider the case of adding to a non-empty list
            // create a new node
            Node newNode = new Node();
            // give the newNode the item as its data
            newNode.data = item;
            // set newNode's next equal to the head
            newNode.next = head;
            // set the head equal to the newNode
            head = newNode;
            size++;
        }
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
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;
            head = newNode;
            size++;
        } else {// consider the case of adding to a non-empty list
            // create a new node with the item as its data
            Node newNode = new Node();
            newNode.data = item;
            newNode.next = null;
            // loop until the end of the list, keeping track of the current node
            Node current = head;
            while (current.next != null) {
                // move current to the next node
                current = current.next;
            }
            // at the end of the list....
            // set the next node equal to the new node
            current.next = newNode;
            size++;
        }
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
        if (size == 0) {
            return null;
        } else if (size == 1) {// if there's only one item: is this a special case?
            ItemType removed = head.data;
            head = null;
            size--;
            return removed;
        } else { // if not empty:
            // 1. make a variable to save a copy of the item at the front
            ItemType removed = head.data;
            // 2. remove the item at the front
            head = head.next;
            // 3. return the variable that has the saved copy of the item at the front
            size--;
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
            ItemType removed = head.data;
            head = null;
            size--;
            return removed;
        } else { // if not empty:
            // 0. figure out a way to access the item in the back
            // create nodes to keep track of current and previous
            Node previous = null;
            Node current = head;
            // loop to the end of the list, keeping track of current
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            // 1. make a variable to save a copy of the item at the back
            ItemType removed = current.data;
            // 2. remove the item at the back
            previous.next = null;
            size--;
            // 3. return the variable that has the saved copy of the item at the back
            return removed;
        }
    }

    public String toString() {
        String result = "";
        Node current = head;
        while (current != null) {
            result += current.data + " ";
            current = current.next;
        }
        return result;
    }
}
