package 递归;

public class 求阶乘 {
public static void main(String[] args) {
    System.out.println(f(3));
}
static int f(int n){
    if(n==1)return 1;
    return n*f(n-1);
//
}
}

