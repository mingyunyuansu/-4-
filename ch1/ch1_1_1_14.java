//题目要求禁用一切Math库函数，然而我别说微积分，高中数学都忘得一干二净，所以用了暴力方法，惭愧
public class ch1_1_1_14{
    public static void main(String args[]){
        System.out.println(mylg(Integer.parseInt(args[0]))+"");
    }
    public static int my2pow(int p){
//这是一个计算2的p（p>=0）次方的方法
        int r = 1;
        for (int i = 0; i < p; i++)
            r *= 2;
        return r;
    }
    public static int mylg(int n){
//这个方法从0开始（实际上不可能是0），不断尝试增加i的大小，最后得到2^i > n的情况，此时i - 1（也就是r就是题目所要结果）
        int r = 0;
        if (n <= 1)
            return -1;
        for (int i= 0; my2pow(i) <= n;i++){
            r = i;
        }
        return r;
    }
}
