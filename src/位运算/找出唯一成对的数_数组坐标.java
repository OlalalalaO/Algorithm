package 位运算;

public class 找出唯一成对的数_数组坐标 {
    public static void main(String[] args) {
        int[] n = {8,9,5,2,7,3,4,6,9,10,1};
        int [] helper = new int[11];
        for (int i = 0; i < helper.length; i++) {
            helper[n[i]]++;

        }
        for (int i : helper) {
            System.out.println(i);
        }
        for (int i = 0; i < n.length; i++) {
            if(helper[i] == 2){
                System.out.println(i);
                break;
            }
        }
    }


}
