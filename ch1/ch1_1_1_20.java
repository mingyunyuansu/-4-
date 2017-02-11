//这题很有意思，我也是有点灵机一动做出来的，简单来说就是递归的边界问题。
//一般我们认为边界就是一个，即终止条件，但是我这里也用到了一个起始条件，即可以在多个地方限制递归，突破常规思维
public class ch1_1_1_20{
    public static void main(String args[]){
        System.out.println("answer: " + my1120(5, 5));
        System.out.println("resolution: " + Math.log(5*4*3*2));
    }
    public static double my1120(int N, int origin){
        if (N == 1)
            return 1;
        if (N == origin)
            return Math.log(N * my1120(N - 1, origin));
        return N * my1120(N - 1, origin);
    }

}
