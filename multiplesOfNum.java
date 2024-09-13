import java.util.*;;

public class multiplesOfNum {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        System.out.print("Enter The Number For Print Multiplication Table : ");
        int n = SC.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d * %d = %d \n", n, i, n * i);
        }
    }
}
