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
        if (size == 0 ){
            head = new Node();
            head.data = item;
            head.next = null;
        } else {
            Node theNewOne = new Node();
            theNewOne.data = item;
            theNewOne.next = head;
            head = theNewOne;
        }
        size ++;
        // consider the case of adding to a non-empty list
    }

    /**
     * Adds an item to the back of the deque.
     *
     * @param item item to be added
     */
    @Override
    public void addLast(ItemType item) {
        // consider the case of adding to an empty list
        if (size == 0 ){
            head.data = item;
            head.next = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != null ){
                currentNode = currentNode.next;
            }
            Node theNewOne = new Node();
            theNewOne.data = item;
            theNewOne.next = null;
            currentNode.next = theNewOne;
        }
        size++;
        // consider the case of adding to a non-empty list
    }

    /**
     * Remove and return the item from the front, does nothing if empty.
     *
     * @return item at the front that was just removed, or null if empty
     */
    @Override
    public ItemType removeFirst() {
        // check if empty
        if (size == 0){
            return null;
        } else if ( size == 1 ){
            ItemType temp = head.data;
            head = null;
            size --;
            return temp;
        } else {
            ItemType temp = head.data;
            head = head.next;
            size --;
            return temp;
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
        if (size == 0 ){
            return null;
        } else if ( size == 1 ){
            ItemType temp = head.data;
            head = null;
            size --;
            return temp;
        } else {
            Node currentNode = head;
            while (currentNode.next != null ){
                currentNode = currentNode.next;
            }
            ItemType temp = currentNode.data;
            currentNode = null;
            size --;
            return temp;
        }

    }
}
