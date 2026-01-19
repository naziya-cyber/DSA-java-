package Practic;
import java.util.Scanner;
public class SumNumSreverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int number = sc.nextInt();
        int number2 = number;
        int reverse= 0;
        while(number2 != 0){
            int digit = number2 % 10;
            reverse  = (reverse * 10) + digit;
            number2 = number2 / 10;   
        }
        // add the numbers 
       
        System.out.println("The sum of " + number + " and " +reverse+" is : " + (reverse + number));
        sc.close();
        
        
    }
    
}
