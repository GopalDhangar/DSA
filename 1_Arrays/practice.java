import java.util.*;
class practice
 {
     public static void main(String k[])
      {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Array size :");
        int n=obj.nextInt();
        int a[]=new int[n];
        int i,s=0;
        System.out.println("Enter the values :" );
       for(i=0;i<n;i++)
        {
        a[i]=obj.nextInt();
         }
    for(int b:a)
     {
       s=s+b;
      }
   System.out.println("Sum= "+s);
   }
}
