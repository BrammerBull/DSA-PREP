package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 4;
        if(position(arr, target) == -1)
        System.out.println("Element is not present in Array");
       else
        System.out.println("Element is present at "+ position(arr, target)+ " index");
        
    }

      static int position(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid])  //checking if element is present at middle of the array
                return mid;

                //checking in left side of array
             if(target< arr[mid])
                end = mid-1;
            else
                start = mid+1;
      }

    return -1;
}
}