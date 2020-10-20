import java.util.Arrays;

public class MuiltiDimisionArray{
    public static void main(String[] args){
        //二维数组
        int[][] ns = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10}
        };
        System.out.println(Arrays.toString(ns));
        System.out.print(Arrays.toString(ns[1]));
        //三维数组
        int[][][] ns2 = {
            {
                {1,2,3},
                {4,5,6}
            },
            {
                {3,4,5},
                {1,2,3},
            }
        };
        System.out.println();
        System.out.println(Arrays.toString(ns2[1][1]));
    }
}