public class Tranversing{
    public static void main(String[] args){
        int[] ns = {1,4,9,16,25};
        //倒序打印数组元素
        for (int i = 1; i <= ns.length; i++){
            System.out.println(ns[ns.length-i]);
        }
    }
}