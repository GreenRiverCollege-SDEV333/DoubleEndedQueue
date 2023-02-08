public class Main {
    public static void main(String[] args) {

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here
        d1.addFirst("Hello");
        d1.addFirst("hi");
        d1.addFirst("there ");
        //d1.addLast("nope");
        d1.removeLast();
        System.out.println(d1);

        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here
        d2.addFirst("Hello");
        d2.addFirst("Hello");

        System.out.println(d2);

    }
}