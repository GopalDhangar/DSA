import java.util.*;
public class Reverse{

    public static void displayr(Node head){
        if(head==null)return;
        //System.out.print(head.data+" ");
        displayr(head.next);
        System.out.print(head.data+" ");
    }
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
     public static class Node{
        int data;
        Node next;
        Node head=null; 
        Node(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(8);
        Node d=new Node(9);
        Node e=new Node(12);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        display(a);
        System.out.println();
        displayr(a);
    }
}