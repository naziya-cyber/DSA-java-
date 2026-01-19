// * * * * * * * 
// *           * 
// *           * 
// *           * 
// *           * 
// *           * 
// * * * * * * *


package Pattern;
import java.util.Scanner;

public class HollowRec13 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the row : ");
        int n = sc.nextInt();


        System.out.print("Enter the column : ");
        int m = sc.nextInt();

        for(int i = 1; i<= n; i++){
            for(int j = 1; j <= m ; j++){
                if(i == 1 || i == n || j == 1 || j == m){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                    // here you have to print two spaces to maintain the pattern becoz you are printing
                    // "*" and "space"
                }
            }
            System.out.println();
        }
        
        
        
        sc.close();
        
        
    }
}
    