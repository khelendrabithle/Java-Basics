/*5. Java program to compute the sum of the digits of an integer */


import java.util.Scanner;
public class sumOfDigit{
    public static void main(String[]args)
    {
        int temp,reminder,n,sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Digits: ");
        n = sc.nextInt();

        temp=n;
        while(temp != 0)
        {
            reminder = temp%10;
            sum      = sum + reminder;
            temp        = temp/10;
        }
        System.out.println(sum);
    }
}