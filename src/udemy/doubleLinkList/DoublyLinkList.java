package udemy.DoubleLinkList;

public class DoublyLinkList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int val) {
            this.value = val;
        }
    }

    public DoublyLinkList(int vale) {
        Node newNode = new Node(vale);

        head = newNode;
        tail = newNode;
        length = 1;

    }

    public void ProntList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head :" + head.value);
    }

    public void getTail() {
        System.out.println("Head :" + tail.value);
    }

    public void getLength() {
        System.out.println("Head :" + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node revmoveFrist() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean Insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newnode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

        newnode.prev = before;
        newnode.next = after;
        before.next = newnode;
        after.prev = newnode;

        length++;

        return true;
    }

    public Node removeAtpertucaulIndex(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return revmoveFrist();
        }
        if (index == length - 1) {
            removeLast();
        }
        Node temp = get(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;

        temp.next = null;
        temp.prev = null;

        length--;
        return temp;

    }
}
