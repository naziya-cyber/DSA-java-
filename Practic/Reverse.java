package Practic;
import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        // //! my approach
        // int dl;
        // while(number != 0){
        //     dl = number % 10;
        //     number = number/10;
        //     System.out.print( "Reversed number is : " + dl);
            
        // }

        //! another way 

    int reversed = 0;
    while(number != 0 ){
        int digit = number % 10;
        reversed = reversed * 10 + digit;
        number = number/10;
    }
    System.out.println("Reversed number is : " + reversed);
    System.out.println(number);
        
        
            sc.close();
    }
}