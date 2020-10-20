import java.util.Arrays;
public class Ordering{
    public static void main(String[] args){
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        System.out.print("排序前：");
        System.out.print(Arrays.toString(ns));
        //冒泡排序
        System.out.println("冒泡");
        System.out.println("");
        for (int i = 0; i < ns.length - 1; i++){
            for(int j = 0; j < ns.length- 1; j++){
                if (ns[j] > ns[j+1]){
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        System.out.print("排序后：");
        System.out.println(Arrays.toString(ns)+"\n");

        //java自带算法
        System.out.println("java自带");
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
    }
}