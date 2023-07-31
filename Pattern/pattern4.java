public class pattern4 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int row = 1; row < 2*n; row++){
            int totalColInRow = row > n ? 2*n-row: row;

            int totalSpaces = n - totalColInRow;
            for(int s = 0; s < totalSpaces; s++){
                System.out.print(" ");
            }

            for(int col = 1; col <= totalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
