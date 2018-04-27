public class DiagonalMatrix {
    public static void main(String[] args) {
        // - Create (dynamically) a two dimensional array
        //   with the following matrix. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        int[][] multi = new int[5][];
        multi[0] = new int[10];
        multi[1] = new int[10];
        multi[2] = new int[10];
        multi[3] = new int[10];
        multi[4] = new int[10];
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.printf("%d ", multi[i][j]);
            }
            System.out.println();
        }
    }
}








