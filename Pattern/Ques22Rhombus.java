// ________* * * * * 
// ______* * * * *
// ____* * * * *
// __* * * * *
// * * * * *

package Pattern;

import java.util.Scanner;


public class Ques22Rhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length : ");
        int n = sc.nextInt();
        for(int i = 1; i<= n; i++){
            for(int j = i ; j<=n-1; j++){
                System.out.print("__");
            }
            for(int k =1; k<= n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
