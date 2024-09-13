/* Java program to check if a positive number is a palindrome or not */

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        int num = sc.nextInt();

        System.out.println(is_Palindrome(num));
    }

    public static int reverse_nums(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse *= 10;
            reverse += n % 10;
            n /= 10;
        }
        return reverse;
    }

    public static boolean is_Palindrome(int n) {
        return (n == reverse_nums(n));
    }
}
