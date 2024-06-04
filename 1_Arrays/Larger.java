class Arr
 {
  static int big(int a[])
   {
     int max=a[0];
     int sec_max=a[0];
     int i;
     for(i=1;i<a.length;i++)
       {
         if(a[i]>max)
          sec_max=max;
          max=a[i];   
       }
     return sec_max;
    }
 }

class Larger
  {
    public static void main(String k[])
     {
       int a[]={10,7,8,6,54};
       int r=Arr.big(a);
       System.out.println("Second Largest value: "+ r);
     }
  }
  
  