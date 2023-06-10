import java.util.Scanner;

public class typecasting{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number");
        // int n = sc.nextInt();
        // System.out.println(n);

        //Converting Integer to Float(TypeCasting)
      int num = (int)(67.56f);
      System.out.println(num);

      //Automatic type promotion in expression
    //   int a = 257;
    //   byte b = (byte)(a); //257 % 256 = 1
    //   System.out.println(b);

    // int number = 'a';
    // System.out.println(number);
    // char ch = (char)(97);
    // System.out.println(ch);
    byte b = 42;
    char c = 'a';
    short s = 1024;
    int i = 50000;
    float f = 5.67f;
    double d = 0.1234;
    double result = (f*b) + (i/c) - (d-s);
    System.out.println(result);

        sc.close();
}
}