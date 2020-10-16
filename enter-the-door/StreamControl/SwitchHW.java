//某不科学的石头剪刀布
import java.util.Scanner;
public class SwitchHW {
    public static void main(String[] args) {
        int computerChoice = (int)(1+Math.random()*3);
        System.out.println("输入你的选项，石头：1；剪刀：2；布：3");
        Scanner scanner = new Scanner(System.in);
        int userchoice = scanner.nextInt();
        if (userchoice>3){
            System.out.println("搞错了？");
            System.exit(0);
        }
        switch(computerChoice){
            case 1:
                System.out.println("你输了");
                break;
            case 2:
                System.out.println("你赢了");
                break;
            case 3:
                System.out.println("平局");
                break;
        }
        scanner.close();
    }
}
