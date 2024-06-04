class Node{
   int data;
Node next;
Node(int x){
   data=x;
   next=null;
}
}
 class Queue
{
   Node front;
        Queue(){
       front=null;
     }

 void enque(int value){
  Node rear=new Node(value);
  if(front==null){
   front=rear;
}
else{
 Node temp=front;
while(temp.next!=null){
temp=temp.next;
}
temp.next=rear;
}
}

void display(){
   if(front== null)
   System.out.println("Queue is empty: ");
   else{
   Node temp=front;
   while(temp!=null){
   System.out.print(temp.data+" ");
  temp=temp.next;
  }
}
  System.out.println();
  }

int  Size(){
 int count=0;
 Node temp=front;
 while(temp!=null){
  count++;
 temp=temp.next;
}
 return count;
}

void dequeue(){
if(front==null)
 System.out.println("Queue is already empty: ");
else{
 Node temp=front;
 front=front.next;
 temp=null;
}
}

 void peak(){
if(front==null)
 System.out.println("Quque is empty: ");
else
System.out.println(front.data);
}
}


class Queue_1{
   public static void main(String ...k){
    Queue obj=new Queue();
    obj.enque(50);
    obj.enque(40);
     obj.enque(60);
     obj.enque(70);
     obj.display();
    int size=obj.Size();
   System.out.println("Size: "+size);
    System.out.print("peak value: ");
    obj.peak();
    System.out.print("Afte dequeue: ");
    obj.dequeue();
   obj.display();
  }
}
