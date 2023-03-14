import java.util.Scanner;
public class Test1c {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        float productA = (float) (scan.nextFloat() * 0.9);
        float productB = 20;
        float res1 = 2 * productA + 3 * productB;
        System.out.println("Ответ 3: " + res1 + "руб");
    }
}

