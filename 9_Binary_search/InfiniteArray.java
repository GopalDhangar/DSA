class infiniteArray{
    public static void main(String[] args) {
         int[] arr={3,5,7,9,10,90,100,130,140,160,170};
         int target=10;
        System.out.println(findRange(arr,target));
    }
    static int findRange(int[] arr,int target){
        // first find the range
        // first start with the box of size 2
        int start=0;
        int end=1;

        // Condition for the target to lie in the range
        while(target>arr[end]){
            int newStart=end+1;
            // double the box value
            // end=previous end*2;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return Search(arr,target,start,end);
    }
    static int Search(int[] arr,int target,int start,int end){
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}