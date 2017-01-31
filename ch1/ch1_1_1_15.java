import java.util.Arrays;
public class ch1_1_1_15{
    public static void main(String args[]){
        int M = Integer.parseInt(args[0]);
        int [] p = new int[]{1, 2, 3, 4, 4};
        int [] r = histogram(p, M);
        System.out.println(Arrays.toString(r));
    }
    public static int[] histogram(int [] a, int M){
        int [] r = new int[M];
        for (int i = 0; i < M; i++){
            r[a[i]]++;
        }
        return r;
    }
}
