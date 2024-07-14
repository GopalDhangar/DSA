import java.util.*; 
class Node{
  int Data;
 Node next;
 Node(int data){                //Function to create a Node
   this. Data=data;
    next=null;
  }
}

class HeadLink{
  Node Head;
   HeadLink(){                // Function to create a Head
   Head=null;
  }

void addNode(int x){
   Node ptr=new Node(x);              // Node Constructor calling and data 
   if(Head==null){
    Head=ptr;
}
else{
  Node temp=Head;
  while(temp.next!=null){
      temp=temp.next;
   }
temp.next=ptr;
}
}


void Display(){
  if(Head==null){
System.out.println("List is empty ");
}
else{
    Node t=Head;
   while(t!=null){
     System.out.print(t.Data+"  "); 
     t=t.next;
   }
    }
System.out.println();
}

int count(){            // Function to count the linked list
int count=0;
Node temp=Head;
 while(temp!=null){
   count++;
   temp=temp.next;
   }
    return count;
}

void getFirst(){     //Function to get the first value
if(Head==null)
System.out.println("Linked list is empty: ");
else{
      System.out.println("First node is : "+Head.Data);
}
}

void getLast(){        // Function to get the last value
if(Head==null)
System.out.println("Linked list is empty: ");
else{
Node t=Head;
while(t.next!=null){
  t=t.next;
}
System.out.println("Last Node is : "+t.Data);
}
}

void addFirst(int x){          //Function to Add value at first Node
Node ptr=new Node(x);
if(Head==null)
Head=ptr;
else{
ptr.next=Head;
Head=ptr;
}
System.out.print("Linked List after adding first Node: ");
}

void removeFirst(){
if(Head==null)
System.out.println("Linked list is already empty: ");
else{
Node t=Head;
Head=Head.next;
t=null;
}
System.out.print("Linked list after remove first Node: ");
}

int search(int x)         // Function to search the value
{
int p=-1;
int i=0;
Node t=Head;
while(t!=null){
   if(t.Data==x){
     p=i;
     break;
}
i++;
t=t.next;
}
return p;
}


void addAtIndex(int position,int x){
Node ptr=new Node(x);
int i=0;
Node t=Head;
while(t!=null){
if(i==position){
ptr.next=t.next;
t.next=ptr;
}
i++;
t=t.next;
}
System.out.print("After Adding "+x+" at index "+position+": ");
}





}

class SinglyLinkedList{
 public static void main(String k[]){
   HeadLink obj=new HeadLink();
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no of values: ");
   int n=sc.nextInt();
   int list[]=new int[n];
   for(int i=0;i<n;i++){
     list[i]=sc.nextInt();
    obj.addNode(list[i]);
}
obj.Display();
System.out.println("No of Nodes: "+obj.count());
obj.getFirst();
obj.getLast();
obj.addFirst(10);
obj.Display();
obj.removeFirst();
obj.Display();
System.out.println("Enter the value have to search: ");
int value =sc.nextInt();
System.out.println(value+" find at index : "+obj.search(value));
obj.addAtIndex(3,45);
obj.Display();
}
}

  
  
     
   