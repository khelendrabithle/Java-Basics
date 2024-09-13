/* . Write a Java program to count the number of even and odd elements in a given
array */

import java.util.*; 
public class totalEvenOddInArray {
 public static void main(String[] args)
 {
    int[] nums = {25,58,98,74,57};
    int ctreven = 0, ctrodd = 0;
    System.out.println("Original Array: "+Arrays.toString(nums)); 
 
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 0)
        {         
          ctreven++;
        }
        else
           ctrodd++;    
    }                 
    System.out.printf("\nNumber of even elements in the array: %d",ctreven);
    System.out.printf("\nNumber of odd elements in the array: %d",ctrodd);
    System.out.printf("\n");    
}
}