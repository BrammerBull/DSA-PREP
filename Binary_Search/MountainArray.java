//finding target element in Mountain of Array
public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println("Target element is at position "+ search(arr, target) );
    }

   static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);

        if(firstTry != -1){
            return firstTry;
        }
        //try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length-1);
    }


    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            //finding middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid+1]){
                //you are in decreasing part of Array,
                //this maybe the ans, but look at the left
                //this is why "end != mid - 1"
                end = mid;
            }
            else{
                //you are in ascending part of Array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        //in the end, start== end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the max one because that is what the       checks says
        return start;
}

static int orderAgnosticBS(int[] arr, int target, int start, int end){

    //find whether the array is sorted in ascending or descending
    boolean isAsc = arr[start]< arr[end];

    while(start <= end){
        //find the middle element

        int mid = start + (end - start) / 2;

        if(arr[mid] == target){
            return mid;
        
        }
        if(isAsc) {
            if(target < arr[mid]) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        else{
            if(target > arr[mid]){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }
    }
    return -1;
}
}
