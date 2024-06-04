class Aqueue{
int q[];
int front,rear;
int size;
Aqueue(int N)
{
size=N;
front=-1;
rear=-1;
q=new int[size];
}

void enqueue(int x){
if(rear==size-1)
  System.out.println("jgdehdfg");
else{
if(front==-1)
front=rear=0;
else
rear++;
q[rear]=x;
}
}

void peek(){
if(front==-1)
System.out.println("queue is empty : ");
else
System.out.println("peek element:"+ q[0]);
}

int Count(){
int count;
if(front==-1)
count=0;
else
count=rear+1;
return count;
}

void dequeue(){
if(front==-1)
System.out.println("underflow :");
else{
int t=q[front];
front++;
}
}



void display()
{
if(front==-1)
System.out.println("underflow: ");
else{
for(int i=front;i<=rear;i++)
{
  System.out.print(q[i]+" ");
}
}
System.out.println();
}
}

class linear_queue{
public static void main(String ...k){
Aqueue obj=new Aqueue(10);
obj.enqueue(10);
obj.enqueue(20);
obj.enqueue(30);
obj.enqueue(40);
obj.enqueue(50);
obj.display();
obj.peek();
int ans=obj.Count();
System.out.println("Count is: "+ans);
obj.dequeue();
obj.display();

}
}