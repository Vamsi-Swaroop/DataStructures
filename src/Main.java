public class Main {
    public static void main(String[] args) {

    LL list= new LL();
        list.insertAtFirst(9);
        list.insertAtFirst(0);
        list.insertAtFirst(7);
        list.insertAtFirst(5);
        list.insertAtLast(20);
        list.insertAtLast(3);
        list.insertAtIndex(4,2);
        list.display();
        System.out.println(list.deleteFirst()+" has been removed from the list");
        list.display();
        System.out.println(list.deleteLast()+" has been removed from the list");
        list.display();
        System.out.println(list.deleteAtIndex(2)+" has been removed from the list");
        list.display();
    }
}
