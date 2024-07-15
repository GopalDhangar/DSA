import java.util.Stack;
import java.util.Scanner;

public class reverseUsingArray{
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
         System.out.println("Original Stack : "+st);
                  int n1=st.size();
                  int[] arr=new int[n1];
                  for(int i=n1-1;i>=0;i--){
                       arr[i ]=st.pop(); 
                   }
                 for(int i=0;i<n1;i++){
                     System.out.print(arr[i]+" ");
                      st.push(arr[i]);
                }
             //System.out.println("After Array Reverse: "+st);
                
     }
}