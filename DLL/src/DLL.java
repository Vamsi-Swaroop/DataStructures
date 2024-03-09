import java.util.Scanner;
public class DLL {
    private Node head;
    private Node tail;
    private int size;

    //Inserting at the begining
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev=null;
        if(head!=null)head.prev= node;
        head= node;
    }

    //printing the list
    public void display(){
        Node temp=head;
        Node last= null;
        while(temp!=null){
            System.out.print(temp.value + "-->");
            last=temp;
            temp=temp.next;
        }
        System.out.println("END");
        char c;
        System.out.println("Do you want to print in reverse??(if yes press y)");
        Scanner s = new Scanner(System.in);
        c= s.next().charAt(0);
        if((c=='y')||(c=='Y')) {
            while (last != null) {
                System.out.print(last.value + "-->");
                last = last.prev;
            }
            System.out.println("Start");
        }
    }

    public void insertAtLast(int val) {
        Node node = new Node(val);
        node.next=null;
        //checks for whether the LL is null,if null, then it will be the first node
        if (head == null) {
            node.prev=null;
            head = node; //We can call insetFirst instead
            return;
        }
        //creating a variable of type node to traverse from the beginning(i.,e from head)
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;
    }

    //inserting after a value
    public void insertAfterValue(int af_val,int val){
        Node node=new Node(val);
        Node temp=head;
        while(temp.value!=af_val){
            temp=temp.next;
            if(temp==null) //condition to check if the given after value is present in List or not
            {
                System.out.println(af_val+" is not present in the list to insert.Please select a valid value");
                return;
            }
        }
        node.next = temp.next;
        temp.next=node;
        node.prev=temp;
        node.next.prev=node;
    }

    public int deleteFirst(){
        head.next.prev=null;
        int deleted=head.value;
        head=head.next;
        System.out.println(deleted + " value at first position has been deleted");
        return deleted;
    }
    public int deleteLast(){
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        // Adjust the pointers to delete the last node
        int deleted= temp.value;
        temp.prev.next = null;
        System.out.println(deleted + " value at last position has been deleted");
        return deleted;
    }

    private class Node{
        private int value;
        private Node next;
        private Node prev;

        //constructors declaration
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public DLL() {
        this.size = 0;
    }
}
