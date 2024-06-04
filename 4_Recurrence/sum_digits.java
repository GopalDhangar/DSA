class sum_digits{
static int digit(int a){
if(a>0)
return a%10+digit(a/10); 
else
return 0;
}
public static void main(String ...k){
int ans=sum_digits.digit(123456);
System.out.println(ans);
}
}