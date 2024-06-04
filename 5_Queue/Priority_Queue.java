class prQueue{
int size;
int pq[];
int front,rear;
prQueue(int n){
size=n;
front=rear=-1;
pq=new int[size];
}

void enqueue(int x)
{
if((front==0 && rear==size-1) || rear==front-1){
System.out.println("Overflow: ");
else if(front==-1){
front=0;
rear=0;
pq[rear]=x;
}
else{
check(x);
rear++;
}
}

void check(int data){
int i,j;
for(int i=0;i<=rear;i++){
 if(data<pq[i]){
for(j=rear+1;j>i;j--){
pq[j]=pq[j-1];
}
pq[j[=data;
return;
}
pq[i]=data;
}

void disp(){
if(front==-1)
system.out.println("Queueu is empty: ");
else{
int i;
for
