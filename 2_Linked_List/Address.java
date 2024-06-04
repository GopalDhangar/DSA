class A
   {
     int x;
    A next;
   }
class Address
{
    public static void main(String ...K)
     {
       A obj1=new A();
       A obj2=new A();
       A obj3=new A();
      obj1.x=10;
      obj2.x=30;
      obj3.x=40;
     obj1.next=obj2;
     obj2.next=obj3;
      System.out.println(obj1.x);
     System.out.println(obj1.next.x);
    System.out.println(obj1.next.next.x);
}
}