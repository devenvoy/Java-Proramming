package Core_Java.LinkedLists;

public class Main {
    public static void main(String[] args) {
        singlyLinkedListExample();
    }

    private static void singlyLinkedListExample() {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertAtTail(5);
        ll.display();
        ll.insertAtTail(12);
        ll.display();
        ll.insertAtTail(4);
        ll.display();
        ll.insertAtHead(13);
        ll.display();
        ll.insertAt(1, 6);
        ll.display();
        ll.insertAt(3, 8);
        ll.display();
        System.out.println("Element at 4 = " + ll.getAt(4));
        ll.deleteAt(2);
        ll.display();
        ll.deleteAt(0);
        ll.display();
        ll.deleteAt(ll.size-1);
        ll.display();
        System.out.println("Hail = "+ll.head.data);
        System.out.println("Tail = "+ll.tail.data);
    }
}
