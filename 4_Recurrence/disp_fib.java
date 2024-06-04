class calc
{
     static int fib(int a)
{
if(a<=1)
return a;
else
return fib(a-1)+fib(a-2);
 }
}
class  disp_fib{
       public static void main(String ...k)          
{ 
int N=15;
for(int i=0;i<N;i++)
{
System.out.print(calc.fib(i)+" ");
}
}
}

           
      
   