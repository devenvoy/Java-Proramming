package Core_Java.LinkedLists;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size;

    public class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertAtHead(int val) {
        Node t = new Node(val);
        if (head == null) {
            head = tail = t;
        } else {
            t.next = head;
            head.prev = t;
            head = t;
        }
        size++;
    }

    public void insertAtTail(int val) {
        Node t = new Node(val);
        if (head == null) {
            head = t;
        } else {
            tail.next = t;
            t.prev = tail;
        }
        tail = t;
        size++;
    }

    public void insertAt(int idx, int val) {
        Node t = new Node(val);
        if (idx == 0) {
            insertAtHead(val);
            return;
        } else if (idx == size) {
            insertAtTail(val);
            return;
        } else if (idx < 0 || idx > size) {
            System.out.println("Index Out of Bound");
            return;
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        t.prev = temp;
        t.next = temp.next;
        temp.next.prev = t;
        temp.next = t;
        size++;
    }

    public void deleteAt(int idx){
        if(idx == 0){
            head = head.next;
            head.prev = null;
            return;
        }
        if (idx < 0 || idx > size) {
            System.out.println("Index Out of Bound");
            return;
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        if(idx == size-1){
            tail = temp;
            tail.next = null;
        }
        size--;
    }
}
