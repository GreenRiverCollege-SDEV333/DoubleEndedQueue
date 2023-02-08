public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here

        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here

        d1.addFirst("adam");
        System.out.println(d1);
        d1.addFirst("kyle");
        System.out.println(d1);
        d1.addLast("sophie");
        d1.addLast("carmella");
        System.out.println(d1);

        System.out.println("index 0:" + d1.removeFirst() + ". was removed");
        System.out.println(d1);




        System.out.println(d1);

        System.out.println("the last index: "+ d1.removeLast() + ". was removed");
        System.out.println(d1);
        System.out.println("the last index: "+ d1.removeLast() + ". was removed");
        System.out.println(d1);
        System.out.println("the last index: "+ d1.removeLast() + ". was removed");
        System.out.println(d1);
        System.out.println("the last index: "+ d1.removeLast() + ". was removed");
        System.out.println(d1);


    }

}