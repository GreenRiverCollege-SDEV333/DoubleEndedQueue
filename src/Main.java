import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here

        d1.addLast("first");
        d1.addLast("second");
        d1.addLast("third");
        d1.addFirst("addFirst");
//        d1.addFirst("first");
//        d1.addFirst("s");
        d1.removeFirst();//remove first
        d1.removeLast();//remove third

        System.out.println(d1);



        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here

        d2.addFirst("First");
        d2.addFirst("second");
        d2.addFirst("third");
        d2.addFirst("four");
        d2.removeLast(); // removed four
        //d2.removeFirst();// remove first
        System.out.println("d2: " + d2);




    }
}