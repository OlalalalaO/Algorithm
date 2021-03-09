package 递归;

public class 反转字符串 {
    public static void main(String[] args) {
        System.out.println(f("qwertyuio",8));
    }
    static String f(String s,int i){
        if (i==0)return String.valueOf(s.charAt(0));
        return s.charAt(i) +f(s,i-1);
    }
}
