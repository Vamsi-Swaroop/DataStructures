
public class Main {
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // Creating a loop in LL
        fifth.next = third;

        // Check if there is a loop
        // in the linked list
        if (detectCycle(head)) {
            System.out.println("Loop detected in the linked list.");
        } else {
            System.out.println("No loop detected in the linked list.");
        }
        System.out.println("the size of cycle in linked list is " + cycleLength(head));
        System.out.println("Starting point of cycle is "+ startNode(head));
    }

    public static boolean detectCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static int cycleLength(Node head) {
        Node fast = head;
        Node slow = head;
        int size = 0;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                Node temp = slow;
                do {
                    temp = temp.next;
                    size++;
                } while (temp != slow);
                return size;
            }
        }
        return 0;
    }
    public static int startNode(Node head){ //returns the starting value of the cycle
        Node first=head;
        Node second=head;
        int length=cycleLength(head);
        if(length==0) return 0; //if length is zero, then cycle is not present hence we return zero
        for(int i=length;i>0;i--){ //pushing second pointer to the value of length which is equal to the length of cycle
            second=second.next;
        }
        while (first != second) { /* once the 2nd pointer is moved to length the first and second pointer are in the same length to the cycle starting element from different directions */
            first = first.next;
            second = second.next;
        }
        return second.data;
    }
}

class Node {
    // Data stored in the node
    public int data;
    // Pointer to the next node in the list
    public Node next;

    // Constructor with both data
    // and next node as parameters
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}