package 位运算;

public class 位运算 {
    public static void main(String[] args) {
        //判断奇偶数
        System.out.println(31&1);
        System.out.println(30&1);

        //交换两个整数变量的值
        int a = 10;
        int b = 8;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        //求函数

        //左移
        System.out.println("无符号右移");
        System.out.println(Integer.toBinaryString(-10));
        System.out.println(Integer.toBinaryString(-10>>2));
        System.out.println(Integer.toBinaryString(10>>2));
        System.out.println(-10>>>2);


        //求绝对值
        System.out.println(8+ "的绝对值是:"+((8^(8>>31))+(8>>>31)));
        System.out.println(-8+ "的绝对值是:" + ((-8^(-8>>31))+(-8>>>31)));

        System.out.println(-8^(-8>>31));
    }
}
