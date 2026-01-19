package Loops;
import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = sc.nextInt();
        //! Methos 1 
        // for(int i = 2; i<number; i++){
        //     if(number % i == 0){
        //         System.out.println("Composite Number !!");
        //         break;
        //     }else{
        //         System.out.println("Prime Number !!");
        //     }
        // }

        //! Method 2
        // boolean flag = true; // Means no is prime 
        // for(int i = 2; i<number; i++){
        //     if(number % i == 0){
        //         flag = false; // means number is composite
        //         break;
        //     }
        // }
        // if(flag == true){
        //     System.out.println("Prime number hai !!");
        // }else if(flag == false){
        //     System.out.println("Composite number hai !!");

        // }

        //! Method 3 
        for(int i = 2; i<= Math.sqrt(number) ; i++){
            if(number % i == 0){
                System.out.println("composite number hai !!");
                break;
            }else if(number % i != 0){
                System.out.println("Prime number hai !!");
                break;
            }

        }

        sc.close();
    }
    
}
