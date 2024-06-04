class Cqueue{
int   cq[];
int size;
int front,rear;
Cqueue(int n){
size=n;
front=-1;
rear=-1;
cq=new int[size];
}

void enqueue(int x){
if((front==0 && rear==size-1) || rear==front-1)
System.out.println("Circcular Queueu is overflow: ");
else
{
         if(front==-1){
        front=0;
        rear=0;
     }
else if(rear==size-1)
{
rear=0;
}
else{
rear++;
}
}
cq[rear]=x;
}

void dequeue(){
if(front==-1 )
System.out.println("queue is alredy empty: ");
else{
      int t=cq[front];
     System.out.println("deleted value is : "+t);
    if(front==rear){
   front=-1;
rear=-1;
}
else if(front==size-1){
front=0;
}
else{
front++;
}
}
}

void display(){
if(front==-1)
System.out.println("Queue is empty: ");
else
{
if(rear<front){
  for(int i=front;i<=size-1;i++)
System.out.print(cq[i]+" ");
for(int i=0;i<=rear;i++)
System.out.print(cq[i]);
}
else{
for(int i=front;i<=rear;i++)
System.out.print(cq[i]+ " ");
}
}
System.out.println();
}
}

class Circular_queue{
public static void main(String ...k){
Cqueue obj=new Cqueue(5);
obj.enqueue(90);
obj.enqueue(80);
obj.enqueue(60);
obj.enqueue(20);
obj.enqueue(10);
obj.display();
obj.dequeue();
//obj.display();
}
}
