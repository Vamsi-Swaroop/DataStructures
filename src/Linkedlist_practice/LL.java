package Linkedlist_practice;
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

    //display function for Linkedlist_practice.LL
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
        //Removing duplicates from A Sorted Linked List
        void duplicateRemoval(){
        Node temp=head;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next= temp.next.next;
            }
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
    }

    public static LL merge(LL l1, LL l2, LL ans) {  //function logic to merge two SORTED linked lists
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        while (temp1 != null && temp2 != null) {
            if (temp1.value < temp2.value) {
                ans.insertAtLast(temp1.value);
                temp1 = temp1.next;
            }
            ans.insertAtLast(temp2.value);
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            ans.insertAtLast(temp1.value);
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            ans.insertAtLast(temp2.value);
            temp2 = temp2.next;
        }
        return ans;
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

    public static void main(String[] args) {
        LL l1 =new LL();
        LL l2 = new LL();
        LL ans = new LL();
        l1.insertAtLast(1);
        l1.insertAtLast(5);
        l1.insertAtLast(9);
        l2.insertAtLast(2);
        l2.insertAtLast(4);
        l2.insertAtLast(7);
        l2.insertAtLast(11);
        l1.display();
        l2.display();
        merge(l1,l2,ans);
        ans.display();
    }
}
