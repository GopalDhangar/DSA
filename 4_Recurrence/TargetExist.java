public class TargetExist {
    static boolean targetExist(int[] arr, int target, int index) {
        if (index == arr.length - 1)
            return false;
        return arr[index] == target || targetExist(arr, target, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 56, 34 };
        int target = 56;
        System.out.println(targetExist(arr, target, 0));
    }
}