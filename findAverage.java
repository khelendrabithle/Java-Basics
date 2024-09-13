
/* */
import java.util.Scanner;

public class findAverage {
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the first number :");
            int num1 = in.nextInt();

            System.out.println("Enter the second number :");
            int num2 = in.nextInt();

            System.out.println("Enter the third number :");
            int num3 = in.nextInt();

            System.out.println("Enter the fourth number :");
            int num4 = in.nextInt();

            System.out.println("Enter the fifth number :");
            int num5 = in.nextInt();

            float average = (num1 + num2 + num3 + num4 + num5) / 5;
            System.out.println(average);
      }

}
