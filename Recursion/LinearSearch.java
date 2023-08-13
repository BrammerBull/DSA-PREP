public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,17,9};
        int target = 18;
        System.out.println(search(arr, target, 0));
    }

    static boolean search(int[] arr, int target, int index){
     
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || search(arr, target, index+1);
    }
}
