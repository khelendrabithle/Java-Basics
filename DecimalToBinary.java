/* Write a Java program to convert a decimal number to binary numbers */

public class DecimalToBinary{ 
   
public static void toBinary(int decimal){    
     int binary[] = new int[40]; 
   
     int index = 0;    
     while(decimal > 0)
{    
       binary[index++] = decimal%2;    
       decimal = decimal/2;    
     }
    
     for(int i = index-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
System.out.println();//new line  
}  
  
public static void main(String args[]){      
System.out.println("Decimal of 123 is: ");  
toBinary(123);
    
System.out.println("Decimal of 20 is: ");  
toBinary(20); 
   
System.out.println("Decimal of 35 is: ");    
toBinary(35);  

}
} 