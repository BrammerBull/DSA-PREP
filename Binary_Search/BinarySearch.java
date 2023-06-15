package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {25,22,19,10,7,6,2,1,0};
        int target = 22;
        if(position(arr, target) == -1)
        System.out.println("Element is not present in Array");
       else
        System.out.println("Element is present at "+ position(arr, target)+ " index");
        
    }

      static int position(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        //checking whether the Array is sorted in Ascending or Descending order
        boolean isAsc = arr[start] < arr[end];
        
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid])  //checking if element is present at middle of the array
                return mid;

            if(isAsc){

             if(target< arr[mid])
                end = mid-1;
            else
                start = mid+1;
            }
            else {
                if(target > arr[mid])
                   end = mid-1;
            else
                start = mid+1;
            }
      }

    return -1;
}
}