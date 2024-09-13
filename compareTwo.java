/* Write a java programme to compare two numbers */

import java.util.Scanner;

public class compareTwo {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("First number: ");
        num1 = input.nextInt();
        System.out.print("Second number: ");
        num2 = input.nextInt();
        if (num1 == num2)
            System.out.printf("%d == %d\n", num1, num2);
        if (num1 != num2)
            System.out.printf("%d != %d\n", num1, num2);
        if (num1 < num2)
            System.out.printf("%d < %d\n", num1, num2);
        if (num1 > num2)
            System.out.printf("%d > %d\n", num1, num2);
        if (num1 <= num2)
            System.out.printf("%d <= %d\n", num1, num2);
        if (num1 >= num2)
            System.out.printf("%d >= %d\n", num1, num2);
    }
}