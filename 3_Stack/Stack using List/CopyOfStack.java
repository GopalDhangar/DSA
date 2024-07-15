import java.util.Stack;
import java.util.Scanner;

public class CopyOfStack{
     public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            Stack<Integer> st1=new Stack<>();
             System.out.println("Enter the no of elements you want to insert: ");
            int n=sc.nextInt();
           System.out.println("Enter the elements you want to insert: ");
            for(int i=1;i<=n;i++){
                    int x=sc.nextInt();
                     st1.push(x);
                }
            System.out.println(st1);   

           //Creating a stack for storing from original
                Stack<Integer> st2=new Stack<>();
                while(st1.size()>0){
                  st2.push(st1.pop());
               }
             System.out.println(st2);
   
           //Creating  stack for copying from temp
                 Stack<Integer> st3=new Stack<>();
                  while(st2.size()>0){
                  st3.push(st2.pop());
               }
             System.out.println(st3);


                  
     }
}