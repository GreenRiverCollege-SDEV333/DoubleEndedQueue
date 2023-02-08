public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here

        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here
        d2.addFirst("one");
        d2.addFirst("two");
        d2.addFirst("three");
        d2.addFirst("four");
        System.out.println(d2.removeFirst());
        System.out.println(d2.removeFirst());
        System.out.println(d2.removeFirst());
        System.out.println(d2.removeFirst());
        d2.addLast("one");
        d2.addLast("two");
        d2.addLast("three");
        d2.addLast("four");
        System.out.println(d2.removeFirst());
        System.out.println(d2.removeFirst());
        System.out.println(d2.removeFirst());
        System.out.println(d2.removeFirst());
        d2.addLast("one");
        d2.addLast("two");
        d2.addLast("three");
        d2.addLast("four");
        System.out.println(d2.removeLast());
        System.out.println(d2.removeLast());
        System.out.println(d2.removeLast());
        System.out.println(d2.removeLast());

        System.out.println(System.lineSeparator());
        System.out.println(System.lineSeparator());

        d1.addFirst("one");
        d1.addFirst("two");
        d1.addFirst("three");
        d1.addFirst("four");
        System.out.println(d1.removeFirst());
        System.out.println(d1.removeFirst());
        System.out.println(d1.removeFirst());
        System.out.println(d1.removeFirst());
        d1.addLast("one");
        d1.addLast("two");
        d1.addLast("three");
        d1.addLast("four");
        System.out.println(d1.removeFirst());
        System.out.println(d1.removeFirst());
        System.out.println(d1.removeFirst());
        System.out.println(d1.removeFirst());
        d1.addLast("one");
        d1.addLast("two");
        d1.addLast("three");
        d1.addLast("four");
        System.out.println(d1.removeLast());
        System.out.println(d1.removeLast());
        System.out.println(d1.removeLast());
        System.out.println(d1.removeLast());

    }
}