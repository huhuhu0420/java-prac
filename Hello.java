import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Hello {
    public static void main (String[] args) {
        System.out.println("Hello Java");
        Date now = new Date(); 
        System.out.println(now);
        String msg = new String("msg");
        String msg2 = "msg2" + msg;
        System.out.print(msg2);
        String msg3 = msg2.replace("msg", "eeee");
        System.out.println(msg3);
        int[] nums = new int[3];
        nums[0] = 10;  nums[2] = 3;
        Arrays.sort(nums);
        String num = Arrays.toString(nums);
        System.out.println(num);
        int result = (int) (Math.random() * 100);
        System.out.println(result);
        Scanner scanner = new Scanner(System.in);
        int x =  scanner.nextInt();
        System.out.println("x = " + x);
        int y =  scanner.nextInt();
        System.out.println("y = " + y);
        String[] fruits = {"banana", "melon", "apple"};
        for (String fruit : fruits) 
            System.out.println(fruit);
    }
}
