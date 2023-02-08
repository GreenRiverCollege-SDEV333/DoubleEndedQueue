public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here

        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here

        d1.addFirst("This ");
        d1.addLast("is ");
        d1.addFirst("resizing array!");

        d2.addFirst("Hello");
        d2.addLast("World");
        d2.addFirst("I say to you...");

        System.out.println(d1.size()); //3
        System.out.println(d2.size()); //3

        System.out.println(d2.removeLast());
        System.out.println(d2.removeFirst());
        System.out.println(d2.removeLast());
        System.out.println();

        System.out.println(d1.removeLast());
        System.out.println(d1.removeFirst());
        System.out.println(d1.removeLast());

        System.out.println(d1.size()); //0
        System.out.println(d2.size()); //0

        d1.addLast("Add Last");
        d2.addFirst("Linked Add Last");

//        System.out.println(d1.size()); //0
        System.out.println(d2.size()); //0

        System.out.println(d2.removeFirst());
//        System.out.println(d1.removeFirst());

    }
}