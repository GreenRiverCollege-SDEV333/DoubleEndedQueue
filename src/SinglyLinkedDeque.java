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
        if(item == null){
            throw new NullPointerException();
        }
        // consider the case of adding to an empty list
        // consider the case of adding to a non-empty list

        //case for empty list
        if(head == null){
            //create new node and have head point to it
            Node addThis = new Node();
            addThis.data = item;
            addThis.next = null;
            head = addThis;
        }else{
            //otherwise create new node, have it point to old head, then make it the head
            Node insert = new Node();
            insert.data = item;
            insert.next = head;
            head = insert;
        }
        //track size
        size++;
    }

    /**
     * Adds an item to the back of the deque.
     *
     * @param item item to be added
     */
    @Override
    public void addLast(ItemType item) {
        if(item == null){
            throw new NullPointerException();
        }
        // consider the case of adding to an empty list
        // consider the case of adding to a non-empty list

        //case for empty list:
        if(head == null){
            //made a new node and have head point to it
            Node addThis = new Node();
            addThis.data = item;
            addThis.next = null;
            head = addThis;
        }else{
            //otherwise get to last node
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            //then have it point to a new node rather than null
            Node insert = new Node();
            insert.data = item;
            insert.next = null;
            currentNode.next = insert;
        }
        //keep track of size
        size++;
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

        // if there's only one item: is this a special case?

        // if not empty:
        // 0. figure out a way to access the item in the front
        // 1. make a variable to save a copy of the item at the front
        // 2. remove the item at the front
        // 3. return the variable that has the saved copy of the item at the front

        //check empty
        if(head == null){
            return null;
        }
        //check if one item in list
        else if(head.next == null){
            //take head data, make head null, track size, then return data
            ItemType returnThis = head.data;
            head = null;
            size--;
            return returnThis;

        }else{
            //take head data, make next item head, track size, return data
            ItemType returnThis = head.data;
            head = head.next;
            size--;
            return returnThis;

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

        // if there is only one item: is this a special case?

        // if not empty, has more than one item:
        // 0. figure out a way to access the item in the back
        // 1. make a variable to save a copy of the item at the back
        // 2. remove the item at the back
        // 3. return the variable that has the saved copy of the item at the back

        //if empty
        if (head == null) {
            return null;
        }
        //if one item take head data, make head null, track size, then return data
        else if (head.next == null) {
            ItemType returnThis = head.data;
            head = null;
            size--;
            return returnThis;
        }
        //else get to one item before end of list, grab end item's data to return and make second to last item next = null, return data
        else {
            Node currentNode = head;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            ItemType returnThis = currentNode.next.data;
            currentNode.next = null;
            size--;
            return returnThis;
        }
    }
}
