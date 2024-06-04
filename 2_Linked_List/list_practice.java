class Node{
int data;
Node next;

Node (int x)  // Constructor for Data 
{
 data=x;
 next=null; 
}
}

  class big{
  Node start;
  big(){
   start=null;
   }

   void addData(int a)
    {
      Node ptr=new Node(a);
    if(start==null)
     {
       start=ptr;
      }
     else{
          Node t=start;
          while(t.next!=null)
         {
           t=t.next;
          }
         t.next=ptr;
       }
   }

  void disp()
   {
      if(start==null)
      System.out.println("List is empty");
      else{
             Node t=start;
             while(t!=null)
                    {
                  System.out.print(t.data+" ");
                   t=t.next;
                    }
              }
     }

int count(){
int c=0;
 Node t=start;
 while(t!=null){
  c++;
  t=t.next;
   }
return c;
}

void getFirst(){
 if(start==null)
  {
   System.out.println("List is empty");
   }
 else{
    System.out.println(start.data);
      }
}


void getLast(){
 if(start==null)
  {
   System.out.println("List is empty");
   }
 else{
   Node temp=start;
   while(temp.next!=null){
    temp=temp.next;
     }
    System.out.println(temp.data);
      }
}

void addFirst(int x){
 Node ptr=new Node(x);
 if(start==null){
  start=ptr;
  }
else{
  ptr.next=start;
  start=ptr;
  }
}

void removeFirst()
  {
   if(start==null){
   System.out.println("List is alraedy empty :");
     }
   else{
   Node t=start;
    start=start.next;
   t=null;
    }
 }

int search(int s)
{
int p=-1,i=0;
Node t =start;
while(t!=null){
if(t.data==s)
{
p=i;
break;
}
i++;
t=t.next;
} 
if(p==-1){
  System.out.println("Given Element Not found");
  }
  else{
  System.out.println("Given Element--> "+s+" Found at index no: "+i);
  }
return p;
}


}

class list_practice{
 public static void main(String ...k){
  big obj=new  big();
  obj.addData(10);
  obj.addData(20);
   obj.addData(30);
    obj.addData(40);
    obj.addData(50);
    obj.disp();
    System.out.println();
    System.out.println(obj.count());
    obj.getFirst();
    obj.getLast();
    obj.addFirst(23);
   obj.disp();
   System.out.println();
   obj.removeFirst();
   obj.disp();
  System.out.println();
  obj.search(30);
  }
}
   
    
