public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here
        d1.addFirst("pink");
        d1.addFirst("brown");
        System.out.println(d1.size());

        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here
        d2.addFirst("pink");
        d2.addFirst("brown");
        System.out.println(d2.size());
    }
}