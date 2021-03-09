package 位运算;

public class 是否是2的整数次方 {
    public static void main(String[] args) {
        int i = 16;
        if(((i-1)&i)==0){
            System.out.println("是");
        }
    }

}
