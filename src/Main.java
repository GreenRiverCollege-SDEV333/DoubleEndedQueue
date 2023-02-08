public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here
        d1.addFirst("Hello1");
        d1.addFirst("Hello2");
        d1.addFirst("Hello3");
        d1.addFirst("Hello4");
        d1.addFirst("Hello5");
  //      System.out.println(d1);
 //       d1.addLast("first");
//        d1.removeFirst();
//        System.out.println(d1);


        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here
        d2.addFirst("Hello1");
        d2.addFirst("Hello2");
        d2.addFirst("Hello3");
        d2.addFirst("Hello4");
        d2.addFirst("Hello5");

        System.out.println(d2);

    }
}