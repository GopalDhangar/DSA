import java.util.Stack;

public class PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        stack.push(1);
        while (!stack2.isEmpty()) {
            stack.push(stack2.pop());
        }
        System.out.println(stack);
    }
}
