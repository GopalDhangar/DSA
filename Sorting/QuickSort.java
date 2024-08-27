public class QuickSort {

    // partition program to find less than and greater than pivot
    static int partition(int[] arr, int start, int last) {
        int pivot = arr[last];
        int i = start - 1;// index of new elements
        for (int j = start; j < last; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // After set all elements less than pivot,put pivot on next index so that all
        // elements greater than set automatically after pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[last] = temp;
        return i;
    }

    // divide the array into two array parts before and after pivot index
    static void quickSort(int[] arr, int start, int last) {
        if (start < last) {
            int pivot_index = partition(arr, start, last);
            quickSort(arr, start, pivot_index - 1);
            quickSort(arr, pivot_index + 1, last);
        }

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 8, 4, 1, 3, 9 };
        System.out.println("Array Before sorting");
        for (int b : arr) {
            System.out.print(b + " ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Array After sorting");
        for (int c : arr) {
            System.out.print(c + " ");
        }
    }
}