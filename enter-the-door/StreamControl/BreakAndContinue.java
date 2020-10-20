public class BreakAndContinue{
    public static void main(String[] arg){
        //break
        int sum = 0;
        for (int i = 1;;i++){
            sum = sum + i;
            if (i == 100){
                break;
            }
        }
        System.out.println(sum);
    }
}