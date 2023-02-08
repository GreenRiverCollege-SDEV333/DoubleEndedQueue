public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here
        /*d1.addFirst("Zoe");
        d1.addFirst("Josh");
        d1.addFirst("Tina");
        d1.addFirst("Kelly");
        d1.addLast("Ken");
        d1.addLast("Becky");
        System.out.println("Initial List:");
        System.out.println(d1.toString());
        System.out.println("Size: " + d1.size());

        System.out.println();
        System.out.println("Remove First");
        System.out.println(d1.removeFirst());
        System.out.println(d1.toString());
        System.out.println("Size: " + d1.size());

        System.out.println();
        System.out.println("Remove Last");
        System.out.println(d1.removeLast());
        System.out.println(d1.toString());
        System.out.println("Size: " + d1.size());*/

        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here
        d2.addFirst("Kelly");
        d2.addFirst("Zoe");
        d2.addFirst("Ken");
        System.out.println(d2.toString());

    }
}