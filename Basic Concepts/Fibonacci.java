import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // 0,1,1,2,3,5,8...
        int a=0;
        int b=1;
        

        for(int i=2;i<=num;i++)
        {
            int c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
        sc.close();
    }
}
