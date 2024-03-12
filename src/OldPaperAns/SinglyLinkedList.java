package OldPaperAns;

public class SinglyLinkedList {

    int size = 0; //
    Node head = null; //
    Node tail = null;   //

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public void insertAtHead(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
        } else {                          // <-
            temp.next = head;
            head = temp;
        }
        size++;
    }


    public void insertAtTail(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {                   // <-
            tail.next = temp;
        }
        tail = temp;
        size++;
    }


    public void insertAt(int idx, int data) {
        if (idx == 0) {
            insertAtHead(data);
            return;
        } else if (idx == size) {
            insertAtTail(data);
            return;
        } else if (idx < 0 || idx > size) {
            System.out.println("Invalid Location");
            return;
        }
        Node temp = new Node(data);
        Node t = head;
        for (int i = 1; i <= idx - 1; i++) {
            t = t.next;
        }
        temp.next = t.next;
        t.next = temp;
        size++;
    }

    public void deleteAt(int idx) {
        if (idx == 0) {
            head = head.next;
            size--;      // <-
            return;
        }

        if (idx < 0 || idx > size) {
            System.out.println("Invalid Location");
            return;
        }
        Node t = head;
        for (int i = 1; i <= idx - 1; i++) {
            t = t.next;
        }
        t.next = t.next.next;

        if (idx == size-1) {
            tail = t;
        }
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
