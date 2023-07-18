package CommonProblems;  //Optimal Solution
import java.util.*;
public class LargestElement {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        System.out.println("Enter the Array Elements");
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
                 arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest Element is "+ largest);
       
        sc.close();
    }
}
