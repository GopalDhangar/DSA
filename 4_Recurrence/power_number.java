import java. util.*;
class calc{
      static int power(int n,int p){
       int ans=1;
        if(n==1 || p==0)
          return 1;
        if(n==0 ||p<0)
        return 0;
         if(p>0){
               ans=n*power(n,p-1);
              }
          return ans;
          }
}
class power_number{
     public static void main(String ...k){
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the no and the power: ");
     int n=sc.nextInt();
     int p=sc.nextInt();
      int r=calc.power(n,p);
      System.out.print("ans= "+r);
     }
}