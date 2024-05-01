package udemy.Queues;

public class Queues {

    private Node frist;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queues(int value) {
        Node newNode = new Node(value);
        frist = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = frist;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("Frist:" + frist.value);
    }

    public void getLast() {
        System.out.println("Frist:" + last.value);
    }

    public void getLength() {
        System.out.println("Frist:" + length);
    }

    public void Enqueue(int value) {
        Node newnNode = new Node(value);
        if (length == 0) {
            frist = newnNode;
            last = newnNode;
        } else {
            last.next = newnNode;
            last = newnNode;
        }
        length++;

    }

    public Node Dequeue() {
        if (length == 0) {
            return null;
        }
        Node tmep = frist;
        if (length == 1) {
            frist = null;
            last = null;
        } else {
            frist = frist.next;
            tmep.next = null;
        }
        length--;
        return tmep;

    }

}
