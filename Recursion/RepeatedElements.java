import java.util.ArrayList;
// import java.util.Arrays;

public class RepeatedElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        int target  = 4;
        
        System.out.println(find(arr, target, 0));
    }

    static ArrayList<Integer> find(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ans = find(arr, target, index+1);

        list.addAll( ans);
        return list;
    }
}
