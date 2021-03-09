package 递归;

public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    static int  f(int n){
        if(n == 1||n == 2){
            return 1;
        }
        return f(n-1)+f(n-2);
    }
}
