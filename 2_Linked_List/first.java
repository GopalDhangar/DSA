class A
   {
     int x,y;
}
class first
{
 public static void main(String ...K)
{
  A obj1=new A();
A obj2=obj1;
obj1.x=10;
obj1.y=30;
obj2.x=40;
obj2.y=90;
System.out.println(obj1.x);
System.out.println(obj1.y);
System.out.println(obj2.x);
System.out.println(obj2.y);
}
}