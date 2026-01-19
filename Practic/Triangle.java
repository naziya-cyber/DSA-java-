package Practic;
import java.util.Scanner;


public class Triangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First side : ");
        int number1 = sc.nextInt();


        System.out.print("Enter the Second side : ");
        int number2 = sc.nextInt();


        System.out.print("Enter the Third side : ");
        int number3 = sc.nextInt();

        if(number1 + number2 > number3){
            if(number1 + number3 > number2){
            if(number2 + number3 > number1){
                System.out.println("yes this is the triangle !!");
            }
        }    
        
    }else{
        System.out.println("not the triangle");
    }


        sc.close();
    }
}
