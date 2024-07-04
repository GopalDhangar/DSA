import java.util.*;
 class palindrome{
     static boolean check(String sb){
        int i=0;
        int j=sb.length()-1;
        while(i<j) {
            if (sb.charAt(i)!=sb.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int count=0;
         for(int i=0;i<s.length();i++){
             for(int j=i+1;j<=s.length();j++){
                 if(check(s.substring(i,j))==true){
                     count++;
                 }
             }
         }
         System.out.println(count);
     }
}

