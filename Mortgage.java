import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main (String[] args) {
        int principal;
        double rate;
        int year;
        Scanner in = new Scanner(System.in);
        try {
            do {
                System.out.print("Principal(1K~1M): ");
                principal = in.nextInt();
                if (principal <1000 || principal >100_000)
                    System.out.println("1K~1M");
            }
            while (principal < 1000 || principal > 100_000);
            System.out.print("Annual Interest Rate: ");
            rate = in.nextDouble();
            System.out.print("Period(Years): ");
            year = in.nextInt();
        } finally {
            in.close();
        }
        double mortgage = principal;
        int month = year * 12;
        double month_rate = rate / 100 / 12;
        double temp = Math.pow((1+month_rate), month);
        mortgage *= (month_rate * temp);
        mortgage /= (temp - 1);
        System.out.println("Mortgage: " + mortgage);
        NumberFormat r = NumberFormat.getPercentInstance();        
        String result = r.format(123);
        System.out.println(result);
    }
}
