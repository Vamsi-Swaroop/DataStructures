//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DLL list= new DLL();
        list.insertFirst(12);
        list.insertFirst(9);
        list.insertFirst(6);
        list.insertFirst(14);
        list.insertAtLast(0);
        list.insertAtLast(99);
        list.insertAfterValue(6,11);
        list.insertAfterValue(1,2);
        list.display();
        list.deleteFirst();
        list.deleteLast();
        list.display();
        }
    }
