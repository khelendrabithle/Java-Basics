/* Java program to count the letters, spaces, numbers, and other characters of an input string */

import java.util.Scanner;
public class countLSNOc{

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
     
        char[] ch = str.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int otherChar = 0;
        for (int i = 0; i <str.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                otherChar++;
            }
        }
        System.out.println("The string is :"+str);
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + otherChar);
    }
}