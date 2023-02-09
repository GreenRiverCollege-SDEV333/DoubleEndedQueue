public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        System.out.println();
        System.out.println("-------------------------- Testing ResizingArrayDeque --------------------------");
        System.out.println();
        Deque<String> d1 = new ResizingArrayDeque<>();
        // some test code here

        // Testing addFirst() on empty/non-empty list - I implemented toString() to ease this ...
        d1.addFirst("a");
        d1.addFirst("b");
        d1.addFirst("c");
        d1.addFirst("d");
        d1.addFirst("e");
        d1.addFirst("f");
        d1.addFirst("g");
        d1.addFirst("h");
        d1.addFirst("i");
        d1.addFirst("j");
        d1.addFirst("k");
        d1.addFirst("l");

        // should print in reverse order of addition ...
        System.out.println("Testing addFirst on empty/non-empty, a..l, should print in reverse order");
        System.out.println(d1);

        /// test addLast on non-empty list
        d1.addLast("m");
        d1.addLast("n");
        d1.addLast("o");
        d1.addLast("p");
        d1.addLast("q");
        d1.addLast("r");
        d1.addLast("s");
        d1.addLast("t");
        d1.addLast("u");
        d1.addLast("v");

        // should append these letters to prior in added order
        System.out.println();
        System.out.println("Testing addLast() on non-empty list, m..v, should display in order added");
        System.out.println(d1);

        d1 = new ResizingArrayDeque<>();

        // testing addLast on empty list
        d1.addLast("m");
        d1.addLast("n");
        d1.addLast("o");
        d1.addLast("p");
        d1.addLast("q");
        d1.addLast("r");
        d1.addLast("s");
        d1.addLast("t");
        d1.addLast("u");
        d1.addLast("v");

        System.out.println();
        System.out.println("Testing addLast() on empty list, should display m..v in order");
        System.out.println(d1);

        System.out.println("Removing / printing 1st item in list");
        System.out.println(d1.removeFirst());
        System.out.println("Removing / printing 1st item in list");
        System.out.println(d1.removeFirst());
        System.out.println("Resulting list");
        System.out.println(d1);

        d1 = new ResizingArrayDeque<>();
        System.out.println("Removing / printing item from empty list");
        System.out.println(d1.removeFirst());
        d1.addLast("a");
        System.out.println("Removing / printing item from list that contains just 'a'");
        System.out.println(d1.removeFirst());
        System.out.println("Resulting list (should be empty/blank)");
        System.out.println(d1);
        System.out.println("d1.size: " + d1.size());

        d1.addLast("a");
        d1.addLast("b");
        d1.addLast("c");
        d1.addLast("d");
        d1.addLast("e");

        System.out.println();
        System.out.println("Recreated list, added letters a..e");
        System.out.println(d1);
        System.out.println();

        System.out.println("Testing removeLast(), should remove in reverse order, i.e. (e, d, c, b, a)");
        System.out.println(d1.removeLast());
        System.out.println(d1.removeLast());
        System.out.println(d1.removeLast());
        System.out.println(d1.removeLast());
        System.out.println(d1.removeLast());
        System.out.println("Resulting list - should be empty/blank");
        System.out.println(d1);
        System.out.println("d1.size: " + d1.size());
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("-------------------------- Testing SinglyLinkedDeque --------------------------");
        System.out.println();
        Deque<String> d2 = new SinglyLinkedDeque<>();
        // some test code here

        // Testing addFirst() on empty/non-empty list - I implemented toString() to ease this ...
        d2.addFirst("a");
        d2.addFirst("b");
        d2.addFirst("c");
        d2.addFirst("d");
        d2.addFirst("e");
        d2.addFirst("f");
        d2.addFirst("g");
        d2.addFirst("h");
        d2.addFirst("i");
        d2.addFirst("j");
        d2.addFirst("k");
        d2.addFirst("l");

        // should print in reverse order of addition ...
        System.out.println("Testing addFirst on empty/non-empty, a..l, should print in reverse order");
        System.out.println(d2);

        /// test addLast on non-empty list
        d2.addLast("m");
        d2.addLast("n");
        d2.addLast("o");
        d2.addLast("p");
        d2.addLast("q");
        d2.addLast("r");
        d2.addLast("s");
        d2.addLast("t");
        d2.addLast("u");
        d2.addLast("v");

        // should append these letters to prior in added order
        System.out.println();
        System.out.println("Testing addLast() on non-empty list, m..v, should display in order added");
        System.out.println(d2);

        // start with an empty list
        d2 = new SinglyLinkedDeque<>();

        // testing addLast on empty list
        d2.addLast("m");
        d2.addLast("n");
        d2.addLast("o");
        d2.addLast("p");
        d2.addLast("q");
        d2.addLast("r");
        d2.addLast("s");
        d2.addLast("t");
        d2.addLast("u");
        d2.addLast("v");

        System.out.println();
        System.out.println("Testing addLast() on empty list, should display m..v in order");
        System.out.println(d2);

        System.out.println("Removing / printing 1st item in list");
        System.out.println(d2.removeFirst());
        System.out.println("Removing / printing 1st item in list");
        System.out.println(d2.removeFirst());
        System.out.println("Resulting list");
        System.out.println(d2);

        d2 = new SinglyLinkedDeque<>();
        System.out.println("Removing / printing item from empty list");
        System.out.println(d2.removeFirst());
        d2.addLast("a");
        System.out.println("Removing / printing item from list that contains just 'a'");
        System.out.println(d2.removeFirst());
        System.out.println("Resulting list (should be empty/blank)");
        System.out.println(d2);
        System.out.println("d2.size: " + d2.size());

        d2.addLast("a");
        d2.addLast("b");
        d2.addLast("c");
        d2.addLast("d");
        d2.addLast("e");

        System.out.println();
        System.out.println("Recreated list, added letters a..e");
        System.out.println(d2);
        System.out.println();

        System.out.println("Testing removeLast(), should remove in reverse order, i.e. (e, d, c, b, a)");
        System.out.println(d2.removeLast());
        System.out.println(d2.removeLast());
        System.out.println(d2.removeLast());
        System.out.println(d2.removeLast());
        System.out.println(d2.removeLast());
        System.out.println("Resulting list - should be empty/blank");
        System.out.println(d2);
        System.out.println("d2.size: " + d2.size());
        System.out.println();

    }
}