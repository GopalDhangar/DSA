public class reverseEachWord {
        public static void main(String[] args) {
            String str="I am An Online Educator";
            String ans="";
            StringBuilder sb=new StringBuilder("");
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch!=' '){
                    sb.append(ch);
                }
                else{
                    sb.reverse();
                    ans+=sb;
                    ans+=" ";
                    sb=new StringBuilder("");
                }
            }
            sb.reverse();
            ans+=sb;
            System.out.print(ans);
        }
    }

