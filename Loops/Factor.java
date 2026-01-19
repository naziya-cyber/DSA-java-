package Loops;
// input print all its factor
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        for(int i = 1; i<= Math.sqrt(number) ; i++){
            if(number % i == 0){
                System.out.println(i +" * " + number/i);
            }
        }
        
        sc.close();
    }
    
}
