import java.util.*;

class Node {
    int key;
    Node next;

    public Node(int key) {
        this.key = key;
        next = null;
    }
}

public class Main {

    public static Node newNode(int key) {
        return new Node(key);
    }

    static int countdown(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * countdown(n - 1);
        }
    }

    public static void main(String[] args) {
        // let us create two sorted linked lists to test the above
        // function. Created lists shall be
        // a: 5 -> 10 -> 15 -> 40
        // b: 2 -> 3 -> 20
        Node a = new Node(5);
        a.next = new Node(10);
        a.next.next = new Node(15);
        a.next.next.next = new Node(20);

        Node b = new Node(2);
        b.next = new Node(3);
        b.next.next = new Node(3);

        List<Integer> list = new ArrayList<>();
    }

}
