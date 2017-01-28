//试试手，题目很简单，书上也提供了循环的方法，我写了个递归的，当作复习递归
public class ch1_1_1_9 {
  public static void main(String args[]){
      int N = Integer.parseInt(args[0]);
      String s = "";
      s = O2B(s, N);
      System.out.println(s);
  }
  public static String O2B(String s, int N){
      if (N / 2 == 0){
          s += N%2;
          return s;
      }
      return O2B(s, N/2) + N%2;
  }
}
