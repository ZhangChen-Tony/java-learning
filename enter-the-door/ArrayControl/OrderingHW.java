// 降序排序
import java.util.Arrays;

public class OrderingHW {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns));
        // TODO:
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        for(int i = 0; i < ns.length/2; i++){
        int tmp = ns[i];
        ns[i] = ns[ns.length-i-1];
        ns[ns.length-i-1] = tmp;
        System.out.println(Arrays.toString(ns));
        }

        // 排序后:
        System.out.println(Arrays.toString(ns));
        if (Arrays.toString(ns).equals("[96, 89, 73, 65, 50, 36, 28, 18, 12, 8]")) {
            System.out.println("测试成功");
        } else {
            System.out.println("测试失败");
        }
    }
}