import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = scan.nextDouble();
        System.out.println("Введите y: ");
        double y = scan.nextDouble();
        double z = (x*x + y*y);
        System.out.printf("sqrt(%.3f) = %.3f%n", z, Math.sqrt(z));

    }
}