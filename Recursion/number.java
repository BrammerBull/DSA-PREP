//printing number from N to 1 using recursion
public class number {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        fun(n-1);
    }
}
