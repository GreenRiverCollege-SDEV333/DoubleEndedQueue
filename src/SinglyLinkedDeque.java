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
        Node newNode = new Node();
        if(size==0){
            newNode.data = item;
            newNode.next = null;
            head = newNode;
            size++;
         }else {
            newNode.data = item;
            newNode.next = head;
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
        Node newNode = new Node();
        if(size==0){
            newNode.data = item;
            newNode.next = head;
            head = newNode;
            size++;
        }else{
            Node current = head;
            while (current.next !=null) {
                current=current.next;
            }
            newNode.data = item;
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
        // consider the case of adding to an empty list
        // consider the case of adding to a non-empty list
    }

    /**
     * Remove and return the item from the front, does nothing if empty.
     *
     * @return item at the front that was just removed, or null if empty
     */
    @Override
    public ItemType removeFirst() {
        ItemType thingToReturn;
        // check if empty
        if(size==0){
            thingToReturn= null;
        }else {
            thingToReturn = head.data;
            Node current = new Node();
            current.next = head;
            head = current.next.next;
            size--;
        }

        return thingToReturn;
    }

    /**
     * Remove and return the item from the back, does nothing if empty.
     *
     * @return item at the back that was just removed, or null if empty
     */
    @Override
    public ItemType removeLast() {
        ItemType thingToReturn;
        // check if empty
        if(size==0){
            thingToReturn= null;
        }else {
            Node current = head;
            while (current.next!=null){
                current = current.next;
            }
            thingToReturn = current.data;
        }size --;

        return thingToReturn;
    }
}
