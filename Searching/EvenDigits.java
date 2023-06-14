package Searching;

//Here we will be finding Numbers with Even number of Digits

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 15, 111, 2345, 123456, 456, 789};
    System.out.println("Numbers having even digits in the Array are "+ findNumbers(nums));
        
    }

    //function for counting the numbers having even digits

    static int findNumbers(int[] nums)
    {
        int count=0;
        for(int num: nums)
        {
            if(even(num))
            {
                count++;
            }
            
        }
        return count;
    }

    //function to  check whether a number contains even digits or not
    static boolean even(int num)
    {
        int numberofDigits = digits(num);
        if(numberofDigits % 2 == 0)
        {
            return true;
        }
        return false;
    }

    // function to count number of digits in a number

    static int digits(int num){
        int count=0;

        while(num>0)
        {
            count++;
            num=num/10;
        }
        return count;
    }
}
