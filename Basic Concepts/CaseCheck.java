import java.util.Scanner;

public class CaseCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <='z')
        {
            System.out.println("It is lowercase character");
        }
        else{
            System.out.println("It is uppercase character");
        }

       // System.out.println(ch);
        sc.close();
    }
}