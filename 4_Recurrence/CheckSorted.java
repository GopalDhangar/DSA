public class CheckSorted {

    static boolean checkSorted(int[] arr, int index) {
        // Base Condition
        if (index == arr.length - 1)
            return true;
        return arr[index] < arr[index + 1] && checkSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 8, 9, 12 };
        System.out.println(checkSorted(arr, 0));
    }
}
