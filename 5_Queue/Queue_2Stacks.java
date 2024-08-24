import java.util.*;

public class Queue_2Stacks {
    static Stack<Integer> stack1 = new Stack<>();
    static Stack<Integer> stack2 = new Stack<>();

    public void add(int data) {
        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(data);
        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int remove() {
        if (stack1.isEmpty()) {
            System.out.println("Empty stack");
            return -1;
        }
        return stack1.pop();
    }

    public int peek() {
        if (stack1.isEmpty()) {
            System.out.println("Empty stack");
            return -1;
        }
        return stack1.peek();
    }

    public static void main(String[] args) {
        Queue_2Stacks obj = new Queue_2Stacks();
        obj.add(90);
        obj.add(45);
        obj.add(34);
        obj.add(45);
        while (!stack1.isEmpty()) {
            System.out.println(obj.remove());
        }
    }
}