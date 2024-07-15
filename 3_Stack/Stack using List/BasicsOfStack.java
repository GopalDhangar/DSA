import java.util.Stack;
import java.util.Scanner;

public class BasicsOfStack{
     public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            Stack<Integer> st=new Stack<>();
             System.out.println("Enter the no of elements you want to insert: ");
            int n=sc.nextInt();
           System.out.println("Enter the elements you want to insert: ");
            for(int i=1;i<=n;i++){
                    int x=sc.nextInt();
                     st.push(x);
                }
            System.out.println(st);          
     }
}