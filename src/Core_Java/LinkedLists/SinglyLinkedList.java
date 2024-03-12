package Core_Java.LinkedLists;

public class SinglyLinkedList {

    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    public void insertAt(int idx, int val) {
        Node t = new Node(val);
        Node temp = head;
        if (idx == size) {
            insertAtTail(val);
            return;
        } else if (idx == 0) {
            insertAtHead(val);
            return;
        } else if (idx < 0 || idx > size) {
            System.out.println("Wrong Index");
            return;
        }
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        size++;
    }

    public void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void display(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        display(head.next);
    }

    void displayRevesed(Node head) {
        if (head == null) {
            return;
        }
        displayRevesed(head.next);
        System.out.print(head.data + " ");
    }

    int getAt(int idx) {
        if (idx < 0 || idx > size) {
            System.out.println("Wrong Index");
            return -1;
        }
        Node temp = head;
        for (int i = 0; i <= idx - 1; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void deleteAt(int idx) {
        if (idx == 0) {
            head = head.next;
            size--;
            return;
        }

        if (idx < 0 || idx > size) {
            System.out.println("Wrong Inddex");
            return;
        }

        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        if (idx == size-1) {
            tail = temp;
        }

        size--;
    }

}
