
class test {
    public static void divide (int a, int b) throws ArithmeticException {
        int c = a / b;
        System.out.println(a+"/"+b+"="+c);
    }
}

public class Throw {
    public static void main (String args[]) {
        try {
            test.divide(10, 0);
        }
        catch (ArithmeticException e) {
            System.out.println(e+" throwed");
        }
    }
}
