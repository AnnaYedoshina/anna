import java.util.Scanner;
public class discount {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        double productA = scan.nextDouble();
        double productB = 20;
        double price = productB + productA;
        double discount_percent = 0.1;
        if (price == productB + productA)
        { price = (price * 0.9);}
        double discount_value = price * discount_percent;
        double new_price = price - discount_value;
        System.out.println(discount_value);
        System.out.println(new_price);




    }
}
