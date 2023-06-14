package Linear_Search;

// Here we are calculating the wealth for individual customer and returning the richest cutomers wealth.
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1},{2,5,7}};
        System.out.println("Richest Customer wealth is "+ maxWealth(accounts));
    }

    static int maxWealth(int[][] accounts)
    {
        //person = row
        //account = col

        int ans = Integer.MIN_VALUE;
        for(int[] ints: accounts)
        {
            int sum = 0;  // when you start a new column take a new sum for that row
            for(int anInt: ints)
            {
                sum+=anInt;
            }
            //Now Check with overall ans

            if(sum > ans)
            ans = sum;
        }
        return ans;
    }
}
