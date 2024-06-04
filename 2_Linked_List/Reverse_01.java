class Node{
  int data;
  Node next;
 Node(int x){
 data=x;
 next=null;
}
}

class Slink{
  Node head;

 Slink(){
 head=null;
}

void addNode(int a){
Node ptr=new Node(a);
if(head==null)
head=ptr;
else{
Node temp=head;
while(temp.next!=null){
temp=temp.next;
}
temp.next=ptr;
}
}

void disp()
{
if(head==null){
System.out.println("Linked list is empty: ");
}
else{
Node temp=head;
while(temp!=null){
System.out.print(temp.data+" ");
temp=temp.next;
}
}
}

void reverse(Node temp){
if(temp!=null){
    reverse(temp.next);
System.out.print(temp.data+" ");
}
}
}

class reverse_01{
public static void main(String ...k){
Slink obj=new Slink();
obj.addNode(50);
obj.addNode(40);
obj.addNode(30);
obj.addNode(10);
obj.addNode(90);
obj.disp();
obj.reverse(obj.head);
}
}