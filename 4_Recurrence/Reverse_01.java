import java.util.*;
class Node_01
{
    int data;
    Node_01 next;                // Data Variable
    Node_01(int value)           // Constructor called when object create
    {
        data=value;
        next=null;
    }
}
class head_link {
    Node_01 head;

    head_link()             //    Head Constructor
    {
        head = null;
    }

    void addNode(int x) {
        Node_01 ptr = new Node_01(x);        //Node constructor called to pass value
        if (head == null)
            head = ptr;
        else {
            Node_01 temp = head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next = ptr;
        }
    }


    void display() {
        if(head == null)
            System.out.println("linked list is empty: ");
        else{
            Node_01 temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    void reverse(Node_01 temp){
        if(temp!=null) {
            reverse(temp.next);
            System.out.print(temp.data+" ");
        }
    }
}

    class Reverse_01{
        public static void main(String[] args) {
            head_link obj=new head_link();
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                obj.addNode(x);
            }
           obj.display();
            System.out.println();
            obj.reverse(obj.head);
        }
    }
