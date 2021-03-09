package 位运算;

public class 求二进制中的1个个数 {
    public static void main(String[] args) {
        System.out.println(method1(3));
        System.out.println(method1(3));
    }
    static int method1(int i){
        int count = 0;
        for (int j = 0; j < 32; j++) {
            if ((i&(1<<j))==(1<<j))count++;
        }
        return count;
    }
    static int method2(int i){
        int count = 0;
        while (i!=0){
            i = (i-1)&i;
            count++;
        }
        return count;
    }
}
