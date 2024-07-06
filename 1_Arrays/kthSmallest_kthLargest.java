import java.util.*;
class  kthSmallest_kthLargest{
    static int[] small_large(int arr[],int k1,int k2){
        Arrays.sort(arr);
        int[] ans={arr[k1-1],arr[arr.length-k2]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the size :");
        int size=input.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements :");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("enter the value of kth smallest and kth largest");
        int n1= input.nextInt();
        int n2= input.nextInt();
        int result[]=small_large(arr,n1,n2);
        System.out.print(result[0]+" ");
        System.out.println(result[1]);

    }
}