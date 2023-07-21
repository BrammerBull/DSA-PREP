// Finding Rotation count in Rotated Sorted Array
public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {6,6,5,4,3,2,1,0,7};
        System.out.println("Number of times this array is rotated: "+countRotations(arr));

    }

    static int countRotations(int[] arr){
           int pivot = findPivot(arr);
           return pivot + 1;
    }

    //use this when array does not contains duplicates

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid  = start + (end - start) / 2;
            // 4 cases we will write here

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;   // Case-I: Pivot is on right side of array
            }
             if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;//Case-II
             }
             if(arr[mid] <= arr[start]){
                end = mid - 1;
             }
             else{
                start= mid + 1;
             }

        }
        return -1;
    }

    //use this when array contains duplicates
    static int findPivotwithDuplicates(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid  = start + (end - start) / 2;
            
            //4 cases over here
            if(mid < end && arr[mid] > arr[mid+1]){
                    return mid;   
            }
             if(mid > start && arr[mid] < arr[mid-1]){
                   return mid-1;
             }
             
             //if elements at middle, start, end are equal then just skip the duplicates
             if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                //skip the duplicates
                //Note: what if these elements at start and end were the pivot?
                //Check if start is pivot
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start++;

                //check whether end is pivot
                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
             }
             //left side is sorted, so pivot should be in right
             else if(arr[start] < arr[mid] || (arr[start]== arr[mid] && arr[mid] > arr[end] )){
                start = mid+1;

             }
             else{
                end = mid-1;
             }

        }
        return -1;
    }
}
