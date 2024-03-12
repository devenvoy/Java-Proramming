package OldPaperAns;

public class SLLAns {
    public static void main(String[] args){

        SinglyLinkedList sll = new SinglyLinkedList();

        sll.insertAt(0,12);
        System.out.println(sll);
        sll.insertAt(sll.size, 15);
        sll.insertAt(0,9);
        sll.insertAt(2,10);
        sll.insertAt(2,1);

        sll.display();

        sll.deleteAt(0);
        sll.deleteAt(sll.size-1);
        sll.deleteAt(1);

        sll.display();
    }
}
