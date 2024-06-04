class stack
{
int data;
stack next;
stack(int x)
{
data=x;
next=null;
}
}
class slink
{
stack top;
slink()
{
top=null;
}
void push(int x)
{
stack ptr=new stack(x);
if(top==null)
{
   top=ptr;
}
else
{
ptr.next=top;
top=ptr;
}
}

void pop(){
  System.out.println("after pop the top element: ");
  if(top==null)
  System.out.println("Stack is underflow");
 else
  {
  stack temp=top;
  top=top.next;
  temp=null;
  }
}

 void peak(){
   if(top==null)
   System.out.println("Stack is underflow: ");
  else
      System.out.println(top.data);
   }
     


void display(){
   if(top==null)
{
    System.out.println("Stack is underflow: ");
 }
    else
{
        stack temp=top;
        while(temp!=null)
{
         System.out.println(temp.data);
     temp=temp.next;
    }
}
}
}

 class stackFunction{
public static void main(String k[])
{  
  slink obj=new slink();
    obj.push(78);
     obj.push(45);
      obj.push(23);
     obj.push(15);
       obj.display();
      System.out.println();
      obj.pop();
      obj.display();
     System.out.println();
     obj.peak();

   }
}
