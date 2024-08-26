public class Merged_sort {

    // Conquer the Array
    //nlogn
    public void conquer(int[] arr, int start, int mid, int last) {
        int[] merged = new int[last - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;
        // O(n)
        while (idx1 <= mid && idx2 <= last) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= last) {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = start; i < merged.length; j++, i++) {
            arr[j] = merged[i];
        }
    }

    // Divide the Array
    public void divide(int[] arr, int start, int last) {
        if (start >= last)
            return;
        //O(logn)
        int mid = start + (last - start) / 2;
        divide(arr, start, mid);
        divide(arr, mid + 1, last);
        conquer(arr, start, mid, last);

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 1, 9, 7, 8 };
        int n = arr.length;
        System.out.print("Array in unsorted order: ");
        for (int d : arr) {
            System.out.print(d + " ");

        }
        System.out.println();
        Merged_sort obj = new Merged_sort();
        obj.divide(arr, 0, n - 1);
        System.out.print("Array in sorted order: ");
        for (int c : arr) {
            System.out.print(c + " ");

        }

    }

}
