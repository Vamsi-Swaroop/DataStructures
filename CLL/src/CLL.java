public class CLL {
    private Node head;
    private Node tail;

    //insertion into a circular list
    public void insert(int val){
        Node node= new Node(val);
        if(head==null){  //if head is null, it means that the circular list is empty and the we are adding first value
            head=tail=node;
            return;
        }
        //otherwise traverse though the list and insert
        tail.next=node;
        node.next=head;
        tail=node;
    }

    //display list
    public void display(){
        Node temp=head;
        if(head!=null) {
            do {
                System.out.print(temp.value + "-->");
                temp=temp.next;
            } while(temp!=head);
            System.out.println("HEAD");
        }
    }

    public void delete(int val){
        Node temp=head;
        if(temp==null) return; //return the control since the list is empty
        if(temp.value==val){ //logic to delete the head(first) value
            head=temp.next;
            tail.next=head;
            return;
        }
        do{ //logic to delete any other node in the list
            Node nextnode = temp.next;
            if(nextnode.value==val){
            temp.next= nextnode.next;
            break;
            }
            temp=temp.next;
        }while(temp!=head);
    }

    public class Node{
        private  int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
