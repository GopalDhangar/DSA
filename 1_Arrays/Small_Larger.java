import java.util.*;
class arr
{
    static void small(int a[])
    {
        int i;
        int l=Integer.MAX_VALUE;
        for(i=0;i<a.length;i++)
        {
            if(a[i]<l)
                l=a[i];
        }
        int sl=Integer.MAX_VALUE;
        for(i=0;i<a.length;i++)
        {
            if(a[i]<sl && a[i]>l)
                sl=a[i];
        }
        System.out.println("Smallest no is "+l);
        System.out.println("second Smallest no is"+sl);
    }
}
class Small_Larger
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=obj.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the values");
        for(int i=0;i<a.length;i++)
        a[i]=obj.nextInt();
        arr.small(a);
    }
}