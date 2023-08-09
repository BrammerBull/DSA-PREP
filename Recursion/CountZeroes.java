public class CountZeroes {
    public static void main(String[] args) {
        int ans = 50000;
        System.out.println(count(ans));
    }

    static int count(int n){
        return helper(n,0);
    }

    static int helper(int n, int c){
        if(n == 0){
            return c;
        }

        int rem = n%10;
        if(rem ==0 ){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}
