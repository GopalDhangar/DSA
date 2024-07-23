import java.util.*;

public class nextGreaterElement {
    public static int[] nextGreater(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (st.peek() < arr[i] && st.size() > 0) {
                st.pop();
            }
            if (st.size() == 0)
                ans[i] = -1;
            else {
                ans[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 1, 8, 6, 3, 4 };
        int[] res = nextGreater(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}