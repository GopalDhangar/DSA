import java.util.*;

public class BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> ct = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                ct.push(ch);
            } else { // ch==')'
                if (ct.size() == 0)
                    return false;
                if (ct.peek() == '(')
                    ct.pop();
            }
        }
        if (ct.size() > 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.next();// ()()()
        System.out.println(isBalanced(str));
    }
}
