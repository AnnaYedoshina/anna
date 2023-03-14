import java.util.*;

public class Test6
{ static int sum(int n)
{if (n < 10) return n;
    return n % 10 + sum(n / 10);
}
    public static void main(String[] args)

    {Scanner con = new Scanner(System.in);
        int n = con.nextInt();
        if (n < 0) n = -n;
        int res = sum(n);
        System.out.println(res);
        con.close();

    }

}