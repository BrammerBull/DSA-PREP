//Finding peak index in Mountain Array(Bitonic Array)
public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,6,3,2};
        System.out.println("Peak Element index is "+ peakIndexInMountainArray(arr));
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
}
