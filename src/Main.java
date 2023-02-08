public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here
        d1.addFirst("Hi");
        System.out.println(d1);
        d1.removeFirst();
        System.out.println(d1);
        d1.addLast("hi");
        System.out.println(d1);
        d1.removeLast();
        System.out.println(d1);
        d1.addFirst("no");
        d1.addFirst("yes");
        d1.addLast("how");
        System.out.println(d1);
        d1.removeFirst();
        System.out.println(d1);
        d1.removeLast();
        System.out.println(d1);

        //
        System.out.println("END OF ARRAY TESTS");

        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here
        d2.addFirst("Hi");
        System.out.println(d2);
        d2.removeFirst();
        System.out.println(d2);
        d2.addLast("hi");
        System.out.println(d2);
        d2.removeLast();
        System.out.println(d2);
        d2.addFirst("no");
        d2.addFirst("yes");
        d2.addLast("how");
        System.out.println(d2);
        d2.removeFirst();
        System.out.println(d2);
        d2.removeLast();
        System.out.println(d2);
        d2.addLast("know");
        d2.addLast("not");
        d2.addLast("where");
        d2.removeLast();
        System.out.println(d2);

    }
}