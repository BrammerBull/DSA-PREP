public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;

        // System.out.println("Range of the Target value is "+ searchRange(nums, target));
        System.out.println("["+search(nums, target, true)+","+ search(nums, target, false)+ "]");
         
    }

    public static int[] searchRange(int[] nums, int target){

        int[] ans = {-1,-1};

        //check for first occurence of target element

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
         
        return ans;
    }

    //this function just returns the index value of target
     static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            //find the middle element

            int mid = start + (end-start)/2;

            if(target < nums[mid]){
                end = mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else{
                //potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
