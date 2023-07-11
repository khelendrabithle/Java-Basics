import java.util.*;

public class NumGuesGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random() * 100);
        int userNumber = 0;

        do {
            System.out.println("Guess the number : ");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("Wohooo .. Correct Number !!!");
            }

            else if(userNumber > myNumber){
                System.out.println("Number is too large");
        }

          else{
            System.out.println("Number is too small");
          }
        }
          while(userNumber >= 0);
          System.out.println("My Number was " +myNumber);
        
}
}