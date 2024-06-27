import java.util.*;
class firstSecondHalf_2
 {
    public static void main(String ...args)
    {
     System.out.println("Enter size: ");
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     int a[]=new int[n];
     System.out.println("Enter elements: ");
     int i,j;     
     for(i=0;i<n;i++)
      {
       a[i]=obj.nextInt();
      }
      if(n%2==0)
       j=n/2;
      else
      j=(n/2)+1;

     // new array

     int r=0;
     int b[]=new int[n];
     for(i=j;i<n;i++)
     {
      b[r]=a[i];
      r++;
     }
     for(i=0;i<n/2;i++)
     {
       b[r]=a[i];
       r++;
     }
     System.out.println("New Array: ");
     for(int m:b)
     {
      System.out.println(m+" ");
     }
 }
}

