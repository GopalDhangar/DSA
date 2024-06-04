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

void addNode(int x){
Node ptr=new Node(x);
if(head==null)
head=ptr;
else{
Node temp=head;
while(temp!=null){
temp.next=ptr;
temp=temp.next;
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

public static void main(String ...k){
Slink obj=new Slink();
obj.addNode(50);
obj.addNode(40);
obj.addNode(30);
obj.addNode(10);
obj.addNode(90);
obj.disp();
}
}