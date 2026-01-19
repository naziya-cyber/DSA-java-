package Practic;
import java.util.Scanner;

public class Quardrant {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of x : ");
        int x = sc.nextInt();

        System.out.print("Enter the value of y : ");
        int y = sc.nextInt();

        if(x == 0 && y == 0){
            System.out.println(x + " and " + y + " Lies on Origin!!");
        }else if(x == 0 && y != 0){
            System.out.println(x + " and " + y + " Lies on Y axis!");
        }else if(y == 0 && x != 0 ){

            System.out.println(x + " and " + y + " Lies on X axis!");
        }else if(x < 0 && y > 0){
            System.out.println(x + " and " + y + " Lies on 2nd Quardrant!!");
        }else if ( x > 0 && y > 0){
            System.out.println(x + " and " + y + " Lies on 1st Quardrant!!");
        }else if(x < 0 && y< 0){
            System.out.println(x + " and " + y + "Lies on 3rd Quardrant!!");
        }else if (x > 0 && y < 0){
            System.out.println(x + " and " + y + " Lies on 4th Quardrant!!");
        }else{
            System.out.println("Input is invalid!!");
        }

        sc.close();


    }
    
}
