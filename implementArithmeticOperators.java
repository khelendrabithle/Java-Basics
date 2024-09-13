/* Write a Java program to print the sum, multiply, subtract, divide and remainder of two numbers */

import java.util.Scanner;

public class implementArithmeticOperators {
  public static void main(String args[]) {
    int sum, subtract, prod, div, rem;
    Scanner in = new Scanner(System.in);

    System.out.print("Input first number: ");
    int num1 = in.nextInt();

    System.out.print("Input second number: ");
    int num2 = in.nextInt();

    sum = sum(num1, num2);
    System.out.println("Sum: " + sum);

    subtract = subtract(num1, num2);
    System.out.println("Subtraction: " + subtract);

    prod = prod(num1, num2);
    System.out.println("Product: " + prod);

    div = div(num1, num2);
    System.out.println("Division: " + div);

    rem = rem(num1, num2);
    System.out.println("Remainder: " + rem);
  }

  public static int sum(int a, int b)

  {
    int sum = a + b;
    return sum;
  }

  public static int subtract(int a, int b)

  {
    int subtract = a - b;
    return subtract;
  }

  public static int prod(int a, int b)

  {
    int prod = a * b;
    return prod;
  }

  public static int div(int a, int b) {
    int div = a / b;
    return div;
  }

  public static int rem(int a, int b) {
    int rem = a % b;
    return rem;
  }
}