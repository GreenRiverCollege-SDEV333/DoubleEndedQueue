/**
 * This class was created by Ken Hang, four methods addFirst, addLast, removeFirst,
 * and removeLast were implemented by Paul with interfaces by Ken.
 *
 * @author Paul Woods, Ken Hang
 */
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

    @Override
    public String toString() {

        if (head == null)
            return "";

        String s = "";
        Node n = head;

        while (n != null) {
            s += n.data + " ";
            n = n.next;
        }

        return s;
    }

    /**
     * Adds an item to the front of the deque.
     *
     * @param item item to be added
     */
    @Override
    public void addFirst(ItemType item) {

        // Create our new node
        Node n = new Node();
        n.data = item;

        if (head == null) {
            // assign head to point to new node
            head = n;
            size = 1;
        } else {
            // insert new node at head of list
            n.next = head;
            head = n;
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

        // create new node
        Node n = new Node();
        n.data = item;

        if (head == null) {
            // list is empty, assign new node at head of list
            head = n;
            size = 1;
        } else {
            // go to last node
            Node h = head;
            while (h.next != null) {
                h = h.next;
            }

            // add new node at end
            h.next = n; // assign null h.next at last node to equal new node n
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

        // if head is null / list is empty, return null
        if (head == null) {
            return null;
        } else {
            // save 1st item
            ItemType item = head.data;

            // re-assign head to 2nd item, and decrement size
            head = head.next;
            size--;

            return item;
        }
    }

    /**
     * Remove and return the item from the back, does nothing if empty.
     *
     * @return item at the back that was just removed, or null if empty
     */
    @Override
    public ItemType removeLast() {

        // if empty list, return null
        if (head == null) {
            return null;
        } else if (size == 1) {
            // if size = 1, return that item, set list to null
            ItemType item = head.data;
            head = null;
            --size;
            return item;
        } else {
            // list has > 1 node, test using node.next.next ..

            Node h = head;

            // want to maintain reference to new/next-to last node so we can 'remove' the last one
            while (h.next.next != null) {
                h = h.next;
            }


            ItemType item = h.next.data;
            h.next = null;

            --size;

            return item;
        }
    }
}
