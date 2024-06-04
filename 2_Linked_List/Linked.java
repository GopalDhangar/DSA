class A
   {
     int x;
    A next;
   }
class Linked
{
    public static void main(String ...K)
     {
       A start=new A();
       start.x=90;
       start.next=null;
       start.next=new A();
       start.next.x=89;
       start.next.next=null;
     System.out.println(start.x);
     System.out.println(start.next.x);
     System.out.println();
}
}