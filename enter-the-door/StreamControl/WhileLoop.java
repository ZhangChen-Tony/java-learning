import java.util.Scanner;
public class WhileLoop{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("m?");
        int m = scanner.nextInt();
        System.out.println("n?");
        int n = scanner.nextInt();
        int current = m;
        int sum = 0;
        while (current <= n){
            sum = sum + current;
            current++;
        }
        System.out.print("m+,+,+n = ");
        System.out.print(sum);
    }
}