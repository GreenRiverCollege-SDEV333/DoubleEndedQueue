public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here

        // Max: both remove methods on if array is empty, print out nothing to remove
        d1.removeFirst();
        System.out.println(d1);
        d1.removeLast();
        System.out.println(d1);

        //Max: received an error
        //Max: attempted to fix, received a null instead of error
        //Max: third attempt to fix, received same error

        d1.addFirst("Hello");
        System.out.println(d1);

        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here

    }
}