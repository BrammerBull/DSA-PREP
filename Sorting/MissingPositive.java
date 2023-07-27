//Here we will find the first missing positive number  using Cycle Sorting Technique
package Sorting;

public class MissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        
        System.out.println(firstPositive(arr));
    }

    static int firstPositive(int[] arr){
        int  i =0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }

        //finding the positive element
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                return index+1;
            }
        }

        return arr.length+1;


    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]= arr[second];
        arr[second] =temp ;
    }
}
