//here we will find all the duplicates element in the Array After sorting them using Cyclic Sort.
package Sorting;

import java.util.*;;

// import java.util.*;
public class AllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(arr));
    }

    static List<Integer> allduplicate(int[] arr){
                int i = 0;
                while(i < arr.length){
                    int correct = arr[i] - 1;
                    if(arr[i] != arr[correct]){
                        swap(arr, i, correct);
                    }
                    else{
                        i++;
                    }
                }

                //Now finding the Duplicate ones

                List<Integer> ans = new ArrayList<>();
                for(int index = 0; index < arr.length; index++){
                    if(arr[index] != index+1){
                        ans.add(arr[index]);
                    }
                }

                return ans;

    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]  = arr[second];
        arr[second] = temp;
    }
}
