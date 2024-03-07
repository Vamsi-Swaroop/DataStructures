public class LL {
    private Node head,tail;
    private int size;

    public LL() {
        this.size=0;
    }
    public void insertAtFirst(int val){
        Node node =new Node(val);
        node.next=head;
        head=node;
        if(tail==null)
            tail=head;
        size+=1;
    }

    //inserting at a particular node
    public void insertAtIndex(int val,int index){
        if(index==0){
            insertAtFirst(val);
            return;
        }
        if(index==size){
            insertAtLast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;

        }
        Node node =new Node(val,temp.next);
        temp.next = node;
        size++;
    }

    //Delete at first
    public int deleteFirst(){
        int val= head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    //getting node of the ith index by using getNode function (Helps in going to the previous position of the desired index)
    public Node getNode(int index){
        Node node=head;
        for (int i = 0; i < index ; i++) {
            node=node.next;
        }
        return node;
    }
    //delete last
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast= getNode(size-2);
        int val = tail.value;
        tail= secondLast;
        tail.next=null;
        return val;
    }

    //delete at a particular index
    public int deleteAtIndex(int index){
        if(index==0){
            return deleteFirst();}
        if(index== size-1){
            return deleteLast();
        }
        Node prev= getNode(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        return val;
    }

    //display function for LL
    public void display(){
        Node temp=head;
        if(temp==null){
            System.out.println("List is empty");
        }
        while(temp!=null){
            System.out.print(temp.value+ "-->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    //insert at last
    public void insertAtLast(int val){
        if(tail==null){
            System.out.println("List  is empty, current value is added as first element!!");
            insertAtFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next = node;
        tail=node;
        size+=1;
    }


    private class Node{
        private int value;//default value will be 0
        private Node next;//default value will be null

        public Node(int value) { //constructor1
            this.value = value;
        }

        public Node(int value, Node next) { //constructor2
            this.value = value;
            this.next = next;
        }
    }
}
