import java.util.*;
class prime_no
{
  public static void main(String args[])
  {
    System.out.println("Enter size: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter the Elements: ");
    for(int i=0;i<n;i++)
    {
    a[i]=sc.nextInt();
    }
    for(int m:a)
     {
      int p=0;
      for(int i=0;i<m/2;i++)
       {
        if(m%i==0)
         {
        p=1;
        break;
         }
       }
       if(p==0)
       System.out.println(m);
     }
    }
}


    
    

         
