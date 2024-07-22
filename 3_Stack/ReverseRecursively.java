import java.util.Stack;

public class ReverseRecursively {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        // BAse Case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // Recursion
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s) {
        // Base Case
        if (s.isEmpty()) {
            return;
        }
        // Recursion
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
