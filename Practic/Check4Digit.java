package Practic;
import java.util.Scanner;
public class Check4Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        int count = 0; 
        while(number != 0){
            number = number / 10;
            count++;

        }
        if(count == 4){
            System.out.println("yes this is a 4 digit number ");
        }else{
            System.out.println("Not a 4 digit number it is " + count + " digit number!!");
        }
        // note 
        // we can also put the consition (number > 999 &&  number <10000)
        sc.close();

        
    }
    
}
