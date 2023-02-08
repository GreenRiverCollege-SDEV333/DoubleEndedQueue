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
        //First commit test
        if(this.size == 0){
            Node looseNode = new Node();
            looseNode.next = null;
            looseNode.data = item;
            this.head = looseNode;
            this.size++;
        }else{
            Node looseNode = new Node();
            looseNode.next = this.head;
            looseNode.data = item;
            this.head = looseNode;
            this.size++;
        }
        // consider the case of adding to an empty list
        // consider the case of adding to a non-empty list
    }

    /**
     * Adds an item to the back of the deque.
     *
     * @param item item to be added
     */
    @Override
    public void addLast(ItemType item) {
        if(this.size == 0){
            Node looseNode = new Node();
            looseNode.next = null;
            looseNode.data = item;
            this.head = looseNode;
            this.size++;
        }else{
            Node looseNode = new Node();
            looseNode.data = item;
            looseNode.next = null;
            Node currentNode = this.head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = looseNode;
            this.size++;
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
        // check if empty
        // if empty: do nothing and return null
        if(this.size == 0){
            return null;
        }else{
            Node looseNode = this.head;
            this.head = this.head.next;
            this.size--;
            return looseNode.data;
        }

        // if there's only one item: is this a special case?

        // if not empty:
        // 0. figure out a way to access the item in the front
        // 1. make a variable to save a copy of the item at the front
        // 2. remove the item at the front
        // 3. return the variable that has the saved copy of the item at the front
    }

    /**
     * Remove and return the item from the back, does nothing if empty.
     *
     * @return item at the back that was just removed, or null if empty
     */
    @Override
    public ItemType removeLast() {

        if(this.size == 0){
            return null;
        }else if(this.size == 1){
            Node looseNode = this.head;
            this.head = null;
            this.size--;
            return looseNode.data;
        }else{
            Node currentNode = this.head;
            Node previousNode = new Node();
            while(currentNode.next != null){
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            previousNode.next = null;
            this.size--;
            return currentNode.data;
        }
        // check if empty
        // if empty: do nothing and return null

        // if there is only one item: is this a special case?

        // if not empty, has more than one item:
        // 0. figure out a way to access the item in the back
        // 1. make a variable to save a copy of the item at the back
        // 2. remove the item at the back
        // 3. return the variable that has the saved copy of the item at the back

    }
}
