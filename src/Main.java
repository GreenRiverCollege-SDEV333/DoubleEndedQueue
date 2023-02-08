public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here
        d1.addFirst("1");
        d1.addFirst("2");
        d1.addFirst("3");
        d1.addFirst("4");

        d1.addLast("last");
        d1.addLast("next");
        d1.removeLast();



        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here

    }
}