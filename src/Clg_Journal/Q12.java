package Clg_Journal;

public class Q12 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtHead("dev");
        ll.insertAtTail("aryan");
        ll.insertAtTail("2");
        ll.insertAt(ll.size, "33");
        ll.insertAt(0,"devansh");
        ll.insertAt(2,"66");
        ll.display();
        System.out.println("Head " + ll.head.name);
        System.out.println("Tail " + ll.tail.name);
        System.out.println();

        ll.deleteAt(0);
        ll.deleteAt(3);
        ll.deleteAt(ll.size-1);
        ll.display();
        System.out.println("Head " + ll.head.name);
        System.out.println("Tail " + ll.tail.name);
    }

    static class LinkedList {
        int size = 0;
        Node head = null;
        Node tail = null;

        public static class Node {
            String name;
            Node next;

            Node(String n) {
                this.name = n;
            }
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.name);
                temp = temp.next;
            }
        }

        public void insertAtHead(String val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        public void insertAtTail(String val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        public void insertAt(int idx, String val) {
            Node temp = new Node(val);

            if (idx == 0) {
                insertAtHead(val);
                return;
            } else if (idx == size) {
                insertAtTail(val);
                return;
            } else if (idx < 0 || idx > size) {
                System.out.println("Index Out Of Bound");
                return;
            }
            Node t = head;
            for (int i = 1; i <= idx - 1; i++) {
                t = t.next;
            }
            temp.next = t.next;
            t.next = temp;
            size++;
        }

        public void deleteAt(int idx){
            if (idx < 0 || idx > size) {
                System.out.println("Index Out Of Bound");
                return;
            }
            if(idx == 0){
                head= head.next;
                size--;
                return;
            }
            Node temp = head;
            for (int i = 1; i <= idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(idx == size-1){
                tail = temp;
            }
            size--;
        }

    }
}
