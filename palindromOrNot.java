import java.util.*;;

public class palindromOrNot {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = SC.nextInt();

        int sum = 0, revers;
        int temp = num;

        while (num > 0) {
            revers = num % 10;
            sum = (sum * 10) + revers;
            num = num / 10;
        }

        if (temp == sum)
            System.out.println(temp + " is a Palindrome number.");
        else
            System.out.println(temp + " is Not a palindrome number.");
    }
}
