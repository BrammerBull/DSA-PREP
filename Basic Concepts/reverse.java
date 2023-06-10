import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int n = sc.nextInt();
        int num = n;

        int rev=0;
        while(num>0)
        {
            int rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        System.out.println("Reversed Number is:"+ rev);
        sc.close();
    }
}
