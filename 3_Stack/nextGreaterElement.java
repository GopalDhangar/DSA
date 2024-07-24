import java.util.*;
//Input:{1,5,3,2,1,6,3,4};
//Output:{5,6,6,6,6,-1,4,-1}

public class nextGreaterElement {
    public static int[] nextGreater(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 1; i < n; i++) {
            ans[i] = -1;
            while (st.size() > 0 && nums[st.peek()] < nums[i]) {
                ans[st.peek()] = nums[i];
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 3, 2, 1, 6, 3, 4 };
        int[] res = nextGreater(arr);
        for (int e : res) {
            System.out.print(e + " ");
        }
    }
}
