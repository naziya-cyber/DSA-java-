
// *       * 
//   *   *   
//     *     
//   *   *   
// *       * 

package Pattern;

import java.util.Scanner;

public class StarCross {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Length(odd no.) : ");
        int n = sc.nextInt();

        
        for(int i =1; i<= n; i++){
            for(int j = 1; j <= n; j++){
               
                if(j == i || (j+i) == 6){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
        
        
        sc.close();
    }
    
}
