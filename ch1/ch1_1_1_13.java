public class ch1_1_1_13{
    public static void main(String args[]){
        int M = Integer.parseInt(args[0]), N = Integer.parseInt(args[1]);
        int[][] a = new int[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                a[i][j] = (int)(Math.random()*100);
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++)
                System.out.printf("%d\t", a[i][j]);
                System.out.println();
            }
        System.out.println("Reverse:");
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++)
                System.out.printf("%d\t", a[j][i]);
                System.out.println();
            }
    }
}
