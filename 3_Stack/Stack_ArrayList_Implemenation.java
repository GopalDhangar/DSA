import java.util.*;

public class Stack_ArrayList_Implemenation {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // Check Stack Is Empty or not
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public static void push(int data) {
            list.add(data);
        }

        // Pop
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }

    }

    public static void main(String[] args) {
        Stack obj = new Stack();
        obj.push(11);
        obj.push(12);
        obj.push(13);
        obj.push(14);
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}
