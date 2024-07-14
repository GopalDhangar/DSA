import java.util.*;

class Node{
 int data;
Node next, prev;

Node(int x){       // Function to Create Node
data=x;
next=null;
prev=null;
}
}


class HeadLink                     // Function to Create Head Node
{    
 Node Head;
HeadLink(){
Head=null;
}
 
void addNode(int data){      // Function to add Node and data
Node ptr=new Node( data);
if(Head==null){
Head=ptr;
}
else{
Node t=Head;
while(t.next!=null){
  t=t.next;
}
t.next=ptr;
ptr.prev=t;
}
}

void ForwardDisplay(){
if(Head==null)
System.out.println("Doubly linked list is empty: ");
else{
System.out.print("Forward display of linked list : ");
Node t=Head;
while(t!=null){
System.out.print(t.data+" ");
t=t.next;
}
}
System.out.println();
}

void BackwardDisplay(){
if(Head==null)
System.out.println("Linked list is empty: ");
else{
System.out.print("Backward display of linked list : ");
Node t=Head;
while(t.next!=null){
      t=t.next;
     }
 while(t!=null){
   System.out.print(t.data+" ");
    t=t.prev;
  }
}
System.out.println();
}

int count(){
Node t=Head;
int c=0;
while(t!=null){
c++;
t=t.next;
}
return c;
}

void getFirst(){
if(Head==null)
System.out.println("linked list is empty: ");
else{
System.out.println("First value of linked list: "+Head.data);
}
}

void getLast(){
if(Head==null)
System.out.println("Linked list is already empty: ");
else{
Node t=Head;
while(t.next!=null){
t=t.next;
}
System.out.println("Last value of the linked list is: "+t.data);
}
}
  

int search(int x){
Node t=Head;
int p=-1;
int i=0;
while(t!=null){
if(t.data==x){
p=i;
break;
}
i++;
t=t.next;
}
return p;
}

void addAtFirst(int x)
{
 Node ptr=new Node(x);
if(Head==null)
Head=ptr;
else{
ptr.next=Head;
Head.prev=ptr;
Head=ptr;
}
}

void removeFirst(){
if(Head==null)
System.out.println("List is empty,node can't removed: ");
else{
Node t=Head;
Head=Head.next;
Head.prev=null;
t=null;
}
System.out.println("After Remove First Node: ");
}


void addAtLast(int x){
Node ptr=new Node(x);
if(Head==null)
Head=ptr;
else{
Node t=Head;
while(t.next!=null){
  t=t.next;
}
t.next=ptr;
}
ForwardDisplay();
}

void removeAtLast(){
System.out.print("After Removing Last Node: ");
if(Head==null)
System.out.println("List is already empty: ");
else{
Node slow=Head;
Node fast=Head.next;
while(fast.next!=null){
  slow=fast;
fast=fast.next;
}
slow.next=null;
fast.prev=null;
fast=null;
}
ForwardDisplay();
}

void addAtIndex(int position,int value){
if(position<0 || position>count()){
    System.out.println("add at this position is not possible: ");
}
else if(position==0){
addAtFirst(value);
}
else if(position==count()){
addAtLast(value);
}
else{
  Node ptr=new Node(value);
   Node t=Head;
  for(int i=0;i<position;i++){
    t=t.next;
    }
   ptr.next=t.next;
   t.next.prev=ptr;
   t.next=ptr;
    ptr.prev=t;
}
ForwardDisplay();
}

void removeAtIndex(int pos){
if(pos<0 || pos>count()){
  System.out.println("wrong index value: ");
}
else if(pos==0){
removeFirst();
}
else if(pos==count()){
removeAtLast();
}
else{
   Node t=Head;
   Node t1=Head.next;
   for(int i=1;i<pos;i++){
    t=t1;
    t1=t1.next;
   }
   t.next=t1.next;
   t1.next.prev=t;
   t1=null;
   }
 ForwardDisplay();
}















}


class DoublyLinkedList{
public static void main(String k[]){
Scanner sc=new Scanner(System.in);
HeadLink obj=new HeadLink();
obj.addNode(11);
obj.addNode(12);
obj.addNode(13);
obj.addNode(14);
obj.addNode(15);
obj.ForwardDisplay();
obj.BackwardDisplay();
System.out.println("No of node in linked list: "+obj.count());
obj.getFirst();
obj.getLast();
System.out.println("Enter the value you want to search: ");
int value=sc.nextInt();
System.out.println(value+" is  found in the linked list at index: "+obj.search(value));
System.out.println("Enter the value you want to addAtfirst: ");
int value1=sc.nextInt();
obj.addAtFirst(value1);
obj.ForwardDisplay();
obj.removeFirst();
obj.ForwardDisplay();
System.out.println("Enter the value you want to addAtLast: ");
int value2=sc.nextInt();
obj.addAtLast(value2);
obj.removeAtLast();
System.out.println("Enter the index and  value you want to add: ");
int i=sc.nextInt();
int value3=sc.nextInt();
obj.addAtIndex(i,value3);
System.out.println("Enter the index you want to remove: ");
int j=sc.nextInt();
obj.removeAtIndex(j);

}
}



