class Slink_01
 {
   Node_01 start;
   Slink_01()
     {
       start=null;   
      }

  void addlast(int a)
     {
       Node_01 ptr=new Node_01(a);
        if(start==null)
         {
           start=ptr;
        }
       else{
           Node_01 t=start;
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
      {
     System.out.println("list is empty");
      }
    else
     {
       Node_01 t=start;
      while(t!=null)
        {
       System.out.print(t.data+"   ");
        t=t.next;
        }
      }
    System. out.println();
}

int count()
{
  int c=0;
  Node_01 t=start;
  while(t!=null)
   {
    c++;
    t=t.next;
   }
 return c;
}
void getlast()
{
  if(start==null)
  {
  System.out.println("List is Empty:");
    }
else{
       Node_01 t=start;
       while(t.next!=null)
           {
          t=t.next;
          }
       System.out.println(t.data);
      }
}

void addfirst(int x)
 {
   Node_01 ptr= new Node_01(x);
  if(start==null)
  {
    start=ptr;
   }
  else 
     {
       ptr.next=start;
       start=ptr;
      }
}

void removefirst()
   {
    if(start==null)
    System.out.println("List  is Empty");
   else
    {
      Node_01 t=start;
      start=start.next;
      t=null;
     }
  }
int search(int s)
{
int p=-1;
int i=0;
Node_01 t =start;
while(t!=null)
{
if(t.data==s)
{
p=i;
break;
}
i++;
t=t.next;
} 
return p;
}
}
