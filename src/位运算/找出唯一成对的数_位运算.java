package 位运算;

public class 找出唯一成对的数_位运算 {
    public static void main(String[] args) {
        /******
         * 一个数组长度为十一，有十个空间存了1-10，剩下的一个存了一个1-10中的某一个数，求重复的这个数
         * 连续异或，消除重复
         * ***********/
        int[] n = {8,9,5,2,7,3,4,6,9,10,1};
        int x = 0;
        for (int i = 1; i < n.length; i++) {
             x = x^i;
        }
        System.out.println(x);
        for (int i = 0; i < n.length; i++) {
            x = x^n[i];
        }
        System.out.println(x);

    }
}
