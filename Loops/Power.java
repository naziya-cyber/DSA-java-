// 'a' raise to the power 'b'
package Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        System.out.print("Enter the Power : ");
        int power = sc.nextInt();
        
        int result = number;
        for(int i = 1 ; i<power; i++){
            // condition is (i < power) becoz 2*2*2*2*2 ye 4 baar multiply ho rha h na ki 5 baar but this is (2 raise to the power 5)
            result = result * number;
        }
        System.out.println(number + " raise to the power " + power +  " = " + result);

        sc.close();
    }
    
}
