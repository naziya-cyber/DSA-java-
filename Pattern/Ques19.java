
// ________* 
// ______* * 
// ____* * * 
// __* * * * 
// * * * * * 

package Pattern;

import java.util.Scanner;

public class Ques19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for(int i =1; i<= n; i++){
            for(int j = 1; j <= n-i; j++){    // j = i ; j<= n-1
                System.out.print("__");

            } 
            for(int k = 1; k<= i; k++){
                System.out.print("* ");

            }  
            System.out.println(); 
        }
        

        sc.close();

    }
    
}
