public class Main {
    public static void main(String[] args) {

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here
        System.out.println(d1.size());//0
        d1.addLast("Me");

        d1.addLast("Myself");
        d1.addLast("I");

        System.out.println(d1);//okay to this point

        //System.out.println(d1.removeFirst());//
        System.out.println(d1);//
        System.out.println(d1.removeLast());


        System.out.println(d1);
        System.out.println(d1.size());
        d1.addFirst("Try");
        d1.addFirst("again");
        System.out.println(d1.removeLast());


        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here
        d2.addFirst("New");
        d2.addFirst("Node");
        System.out.println(d2.size());
        d2.addLast("Another");
        d2.addLast("attempt");
        System.out.println(d2.removeFirst());

        System.out.println(d2.size());
        System.out.println(d2.removeLast());

    }
}