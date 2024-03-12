package Linkedlist_practice;

import Linkedlist_practice.LL;

public class Main {
    public static void main(String[] args) {

    LL list= new LL();
//        list.insertAtFirst(1);
//        list.insertAtFirst(0);
//        list.insertAtFirst(0);
//        list.insertAtFirst(2);
//        list.insertAtLast(2);
//        list.insertAtLast(3);
//        list.insertAtIndex(4,2);
//        list.display();
//        System.out.println(list.deleteFirst()+" has been removed from the list");
//        list.display();
//        System.out.println(list.deleteLast()+" has been removed from the list");
//        list.display();
//        System.out.println(list.deleteAtIndex(2)+" has been removed from the list");
//        list.display();
        list.insertAtLast(0);
        list.insertAtLast(1);
        list.insertAtLast(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(3);
        list.insertAtLast(6);
        list.display();
        list.duplicateRemoval();
        list.display();
    }
}
