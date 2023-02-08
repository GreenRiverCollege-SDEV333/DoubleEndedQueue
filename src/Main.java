public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        d1.addFirst("Hello");
        d1.addFirst("Bye");
        System.out.println(d1.size());
        System.out.println(d1.removeFirst());
        System.out.println(d1.size());
        System.out.println(d1.removeFirst());
        System.out.println(d1.size());
        d1.addFirst("Hello");
        d1.addFirst("Bye");
        d1.addLast("Hola");
        d1.addLast("Adios");
        System.out.println(d1.size());
        System.out.println(d1.removeLast());
        System.out.println(d1.size());
        System.out.println(d1.removeLast());
        System.out.println(d1.size());
        System.out.println(d1.removeLast());
        System.out.println(d1.size());
        System.out.println(d1.removeLast());
        System.out.println(d1.size());


        Deque<String> d2 = new SinglyLinkedDeque<>();
        d2.addFirst("Hello");
        d2.addFirst("Bye");
        System.out.println(d2.size());
        System.out.println(d2.removeFirst());
        System.out.println(d2.size());
        System.out.println(d2.removeFirst());
        System.out.println(d2.size());
        d2.addFirst("Hello");
        d2.addFirst("Bye");
        d2.addLast("Hola");
        d2.addLast("Adios");
        System.out.println(d2.size());
        System.out.println(d2.removeLast());
        System.out.println(d2.size());
        System.out.println(d2.removeLast());
        System.out.println(d2.size());
        System.out.println(d2.removeLast());
        System.out.println(d2.size());
        System.out.println(d2.removeLast());
        System.out.println(d2.size());

    }
}