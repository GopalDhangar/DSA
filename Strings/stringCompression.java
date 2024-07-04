import java.util.Scanner;
public class stringCompression {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string value : ");
            String s=sc.nextLine();            //aaabbbbccddde
            String ans=""+s.charAt(0);     //a
            int count=1;
            for(int i=1;i<s.length();i++){
                char curr=s.charAt(i);
                char prev=s.charAt(i-1);
                if(curr==prev)
                    count++;
                else{
                    if(count>1)
                        ans += count;
                        count = 1;
                        ans += curr;
                }
            }
            if(count>1)
            ans+=count;
            System.out.println(ans);
        }
    }

