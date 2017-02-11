public class ch1_2_6 {
    public static void main(String args[]){
        String s1 = args[0], s2 = args[1];
        if (s1.length() == s2.length()){
            if (s1.length() == 1 || s2.length() == 2 || s1.equals(s2)){
                System.out.println("Yes");
                return;
            }
            for (int i = 0; i < s2.length(); i++){
                if (s1.substring(i, s1.length()).equals(s2)){
                    System.out.println("Yes");
                    return;
                }
                else{
                    s1 = s1 + s1.charAt(i);//依次将s1的一个字符放到s1末尾，看是否匹配，换句话说，就是暴力尝试s1的所有循环移动形式
                }
            }
        }
        System.out.println("No");
    }
}
