import java.util.Stack;

public class pushAtBottomRecursively {
    public static void pushAtBottom(int data, Stack<Integer> s) {
        // Base Case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        // Recursion
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        pushAtBottom(1, s);
        System.out.println("After push the data: ");
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
