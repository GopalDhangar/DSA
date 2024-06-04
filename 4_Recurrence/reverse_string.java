import java.util.*;
class calc
{
     static void reverse(String a)
      {
          if(a.length()<=1)
System.out.print(a);
          else
{
System.out.print(a.charAt(a.length()-1))`;
 reverse(a.substring(0,a.length()-1));
}
}
}
class reverse_string
{
  public static void main(String ...k)
   {
      Scanner input=new Scanner(System.in);
     String a=input.nextLine();
     
calc.reverse(a);
     
    }
}