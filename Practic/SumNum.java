package Practic;
import java.util.Scanner;
public class SumNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int number = sc.nextInt();
        int sum = 0;
        while(number !=  0){
           sum = sum + number % 10;
           number /= 10;
            

        }
        System.out.println("Sum of the number is : " + sum );
        sc.close();

    }
    
}
