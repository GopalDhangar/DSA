class Node
{
int data;
Node next;
Node pre;
Node(int x)
{
data=x;
next=null;
pre=null;
}
}

class slink
{
Node start;
slink(){
start=null;
}

void addLast(int x){
Node ptr=new Node(x);
if(start==null)
{
start=ptr;
}
else{
Node t=start;
while(t.next!=null){
t=t.next;
}
t.next=ptr;
ptr.pre=t;
}
}

int count()
{
int count =0;
Node t=start;
while(t.next!=null)
{
count++;
t=t.next;
}
return count;
}

void addFirst(int x){
Node ptr=new Node(x);
if(start==null){
start=ptr;
}
else{
ptr.next=start;
start.pre=ptr;
start=ptr;
}
}

void removeFirst(){
if(start==null){
System.out.println("Linked list is already empty");
}
else{
Node temp=start;
start=temp.next;
start.pre=null;
temp=null;
}
}

void removeLast(){
if(start==null){
System.out.println("Linked list is already empty");
}
else if(start.next==null)
{
start=null;
}
else{
Node r=start;
Node temp=start.next;
while(temp.next!=null){
r=temp;
temp=temp.next;
}
r.next=null;
temp=null;
}
}





void fdisp()
{
if(start==null){
System.out.println("linked lsit is empty");
}
else{
Node t=start;
while(t!=null){
System.out.print(t.data+" ");
t=t.next;
}
}
}

void bdisp()
{
if(start==null){
System.out.println("linked lsit is empty");
}
else{
Node t=start;
while(t.next!=null){
t=t.next;
}
while(t!=null){
      System.out.print(t.data+" ");
      t=t.pre;
}
}
}
void arrayConvert(){
int c=0;
Node t=start;
while(t!=null){
  c++;
 t=t.next;
   }
int a[]=new int[c];
int i=0;
Node r=start;
while(i<c){
a[i]=r.data;
r=r.next;
i++;
}
for(int b:a){
System.out.println(b);
}
}

int search(int s){
int i=0,p=-1;
Node t=start;
while(t!=null){
 if(t.data==s){
p=i;
break;
}
i++;
t=t.next;
}
if(p==-1){
System.out.println("Element not found");
}
else{
System.out.println("Given elemnt found at index:"+i);
}
return p;
}

void addAtIndex(int position,int x){
int count =0;
Node temp=start;
while(temp.next!=null)
{
count++;
temp=temp.next;
}
if(position<0 || position>count){
System.out.println("Linked list is empty");
}
else if(position==0){
addFirst(x);
}
else if(position==count){
addLast(x);
}
else{
Node ptr=new Node(x);
int i=1;
Node t=start;
while(i<position){
     i++;
    t=t.next;
}
ptr.next=t.next;
t.next.pre=ptr;
t.next=ptr;
ptr.pre=t;
}
}

void removeAtIndex(int position){
int count =0;
Node temp=start;
while(temp.next!=null)
{
count++;
temp=temp.next;
}
if(position<0 || position>count){
System.out.println("Linked list is empty");
}
else if(position==0){
removeFirst();
}
else if(position==count){
removeLast();
}
else{
int i=1;
Node t=start;
while(i<=position){
  i++;
 t=t.next;
}
t.pre.next=t.next;
t.next.pre=t.pre;
t=null;
}
}




}

class Main{
public static void main(String ...k){
slink obj=new slink();
obj.addLast(10);
obj.addLast(40);
obj.addLast(50);
obj.addLast(60);
obj.addLast(70);
obj.fdisp();
System.out.println(": All values ");
System.out.println("count="+obj.count());
obj.addFirst(78);
obj.fdisp();
System.out.println(":add at first");
obj.bdisp();
System.out.println(": backward display");
obj.removeFirst();
System.out.println(":Remove first");
obj.fdisp();
obj.removeLast();
System.out.println();
obj.fdisp();
System.out.println();
obj.bdisp();
System.out.println();
obj.arrayConvert();
obj.search(40);
obj.addAtIndex(3,49);
System.out.println();
obj.fdisp();
obj.removeAtIndex(3);
System.out.println();
obj.fdisp();


}
}