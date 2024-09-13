import java.util.*;

public class primeOrNot {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Enter The Number : ");
        int num = SC.nextInt();

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
