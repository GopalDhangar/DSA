class A
{
    int x;
    A Next;
    A(int a)
    {
        x=a;
        Next=null;
    }
}
class Traverse
{
    public static void main(String[] args) {
        A start=new A(56);
        start.Next=new A(89);
        start.Next.Next=new A(76);
        start.Next.Next.Next=new A(34);
          A obj=start;
          while(obj!=null)
          {
              System.out.println(obj.x);
              obj=obj.Next;
          }
    }
}