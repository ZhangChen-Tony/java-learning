//请帮小明同学设计一个程序，输入上次考试成绩（int）和本次考试成绩（int），然后输出成绩提高的百分比，保留两位小数位（例如，21.75%）。
import java.util.Scanner;
public class InputAndOutputHW{
    public static void main(String[] args) {
           System.out.println("Enter the score last class");
           Scanner scanner = new Scanner(System.in);
           int last = scanner.nextInt();
           System.out.println("Enter your score this class");
           int current = scanner.nextInt();
           double percentage = (current - last)/last;
           System.out.print("\n");
           System.out.print(percentage);
           System.out.print("%");
           scanner.close();
    }
}