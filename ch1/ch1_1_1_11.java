public class ch1_1_1_11{
    public static void main(String args[]){
        boolean b[][] = new boolean[10][10];
        for (int i = 0; i < 10; i++){
            b[i][i] = true;
        }
        System.out.printf(" 1 2 3 4 5 6 7 8 9 10\n");
        for (int i = 0; i < 10; i++){
            System.out.printf("%d", i+1);
            for (int j = 0; j < 10; j++){
                if (b[i][j])
                    System.out.printf("* ");
                else
                    System.out.printf("  ");
            }
            System.out.println();
        }
    }
}
