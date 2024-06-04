import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter no");
        int num = ob.nextInt();
        int ans = 1;
        int i;
        for(i = 1;i<=num;i++){
            ans = ans*i ;
        }
        System.out.println(ans);
    }
}