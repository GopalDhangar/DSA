import java.util.Stack;
 
public class reverseRecursively{

      static void pushAtBottom(Stack<Integer> st,int x){
     if(st.size()==0) 
      st.push(x);return;
     int top=st.pop();
      pushAtBottom(st,x);
      st.push(top);


     }
      public static void ReverseRec(Stack <Integer> st){
     if(st.size()==1)return;
      int top=st.pop();
     ReverseRec(st);
      pushAtBottom(st,top); 
}
public static void main(String args[]){
  Stack<Integer> st=new Stack();
 st.push(1);
 st.push(2);
 st.push(3);
 st.push(4);
 st.push(5);
 System.out.println(st);
ReverseRec(st);
System.out.println(st);
}
}