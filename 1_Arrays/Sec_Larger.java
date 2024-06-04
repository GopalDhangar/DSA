import java.util.*;
class calc
{
  static int no(int a[])
   {
      int m=a[0];
      int i;
     for(i=0;i<a.length;i++)
      {
        if(a[i]>m)
        m=a[i];
      }
     int sm=Integer.MIN_VALUE;
    for(i=1;i<a.length;i++)
      {
        if(a[i]>sm && a[i]<m)
         sm=a[i];
      }
     return sm;
   }
  }
class Sec_Larger
{
  public static void main(String k[])
  {
    int a[]={10,20,45,89,89,89,45,44};
   int s=calc.no(a);
    System.out.println(s);
  }
}