import java.util.Scanner;

public class SolveFunction{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //设置输入器
        System.out.println("输入a的值");
        double a = scanner.nextDouble();
        System.out.println("输入b的值");
        double b = scanner.nextDouble();
        System.out.println("输入c的值");
        double c = scanner.nextDouble();
        System.out.println("输入d的值");
        double d = scanner.nextDouble();
        System.out.println("输入e的值");
        double e = scanner.nextDouble();
        System.out.println("输入f的值");
        double f = scanner.nextDouble();//输入abcdef
        System.out.print("x = ");//输出
        System.out.println(solveTheFunction(a, b, c, d, e, f));
        scanner.close();//我是随手关门的好宝宝
    }

    static double calculateTheFunction(double a, double b,double c,double d, double e, double f,double x){
        //计算这个五次多项式的值
        return(a*pow(x,5)+b*pow(x,4)+c*pow(x,3)+d*pow(x,2)+e*x+f);
    }

    static double pow(double num, int power){
        //指数函数运算
        double sum = num;
        for(int i = 1; i < power; i++){
            sum = num*sum;
        }
        return sum;
    }

    static double solveTheFunction(double a,double b,double c,double d,double e,double f){
        /**
         * (-1/
         * (difference2-difference)/0.000000001) --> 求导
         * *difference --> 看正方向
         * *0.0001--> 乘一个系数
         * 总的来说，就是函数朝向上方，y大于零的时候这个数是负数；
         * 函数朝向上方，y小于零的时候这个数是正数；
         * 函数朝向下方，y大于零的时候这个数是正数
         * 函数朝向下方，y小于零的时候这个数是正数
         * 简化上述等式，结果为-0.00000000001*difference/(difference2-difference)
         * 并且delta的绝对值随着x与本地最小值距离的减小而减小
         */
        double x = 0;
        double difference = 10;
        while(difference > 0.0000001 || difference < -0.0000001){
            difference = calculateTheFunction(a, b, c, d, e, f, x);
            double difference2 = calculateTheFunction(a, b, c, d, e, f, x+0.00000001);
            double delta = (-0.00000000001*difference/(difference2-difference));
            x = x+delta;
        }
        return x;
    }
}