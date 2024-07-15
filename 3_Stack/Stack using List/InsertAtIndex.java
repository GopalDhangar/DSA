import java.util.Stack;
import java.util.Scanner;

public class InsertAtIndex{
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
             
           // Taking index Value from user
          
            System.out.println("Enter the index value u want to insert : ");
            int idx=sc.nextInt();
             System.out.println("Enter the value you want to insert: ");
            int value=sc.nextInt();
           

           //Creating a temporary stack for storing from original
                Stack<Integer> temp=new Stack<>();
                while(st.size()>idx){
                  temp.push(st.pop());
               }
              st.push(value);
              while(temp.size()>0){
                          st.push(temp.pop());
            }
             System.out.println(st);           
     }
}