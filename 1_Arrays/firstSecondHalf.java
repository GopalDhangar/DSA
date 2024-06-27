import java.util.*;
class firstSecondHalf
 {
    public static void main(String ...k)
    {
     System.out.println("Enter size: ");
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     int a[]=new int[n];
     System.out.println("Enter elements: ");
     int i,j,t;     
     for(i=0;i<n;i++)
      {
       a[i]=obj.nextInt();
      }
     if(n%2==0)
     j=n/2;
     else
     j=(n/2)+1;
     for(i=0;i<n/2;i++)
     {
      t=a[i];
      a[i]=a[j];
      a[j]=t;
      j++;
      }
     System.out.println("New Array: ");
     for(int b:a)
     {
      System.out.println(b+" ");
     }
 }
}

