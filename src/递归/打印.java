package 递归;
//打印i到j
public class 打印 {
    public static void main(String[] args) {
        f(3,10);
    }
    public static void f(int i,int j){
        if (i>j)return;
        System.out.println(i);
         f(i+1,j);
    }
}
