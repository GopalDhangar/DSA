class De_queue{
int size;
int deq[];
int front,rear;

De_queue(int n){
size=n;
front=rear=-1;
deq=new int[size];
}

void insertAtRear(int x)
{
if((front==0 && rear==size-1) || rear==front-1)
System.out.println("Queue is Overflow: ");
else
{
  if(front==-1){
  front=0;
  rear=0;
}else if(rear==size-1){
rear=0;
}else{
rear++;
}
}
deq[rear]=x;
}

void insertAtFront(int y){
if((front==0 && rear==size-1) || rear==front-1)
System.out.println("Queue is overflow: ");
else
{
 if(front==-1){
front=0;
rear=0;
}else if(front==0){
front=size-1;
}else{
 front--;
}
}
deq[front]=y;
}

void display()
{
if(front==-1)
System.out.println("Queue is empty: ");
else
{
  if(rear<front){
for(int i=front;i<=size-1;i++){
System.out.print(deq[i]+" ");
}
for(int i=0;i<=rear;i++){
System.out.print(deq[i]+" ");
}
}
else{
for(int i=front;i<=rear;i++){
System.out.print(deq[i]+" ");
}
}
}
}
}

class Double_ended_queue{
public static void main(String ...k){
De_queue obj=new De_queue(5);
obj.insertAtRear(90);
obj.insertAtRear(80);
obj.insertAtRear(40);
obj.insertAtFront(60);
obj.insertAtFront(70);
obj.display();
}
}

  
  
