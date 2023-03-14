import java.util.Scanner;
public class Test1a {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        float productB = scan.nextFloat();
        float productA = (float) (100 * 0.85);
        float res1 = 10 * productA + 2 * productB;

        System.out.println("Ответ 1:" + res1);


    }
}