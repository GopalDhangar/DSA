class AStack
{
  int st[];
  int size,top;
AStack(int n)
{
  size=n;
  top=-1;
   st=new int[size];
}

int t;
void push(int x)
{
if(top==size-1)
System.out.println("Stack overflow cannot insert: ");
else
{
  top++;
  st[top]=x;
}
}

void peak(){
  if(top==-1){
  System.out.println("Satck is empty: ");
 }else{
   System.out.println(st[top]);
}
}

void display()
{
if(top==-1)
System.out.println("Stack is empty: ");
else
  for(int i=top;i>=0;i--)
{
   System.out.println(st[i]);
}
}



void pop(){
if(top==-1)
System. out.println("Stack is empty : ");
else{
  t=st[top];
top--;
System.out.println("Deleted value is:"+t);
}
}

}

class StackArray
{
public static void main(String ...k)
{
AStack obj=new AStack(5);
obj.push(23);
obj.push(26);
obj.push(56);
obj.push(89);
obj.push(54);
obj.display();
System.out.println("peak value is: ");
obj.peak();
obj.pop();
}
}