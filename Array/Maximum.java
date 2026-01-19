
//? there are two ways to find out the maximum from the aaray 

package Array;
import java.util.Scanner;
public class Maximum {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            System.out.println("Enter the " + i+ "th element of the array: ");
            arr[i] =sc. nextInt();
        }
        System.out.println();

        //? 1st way
        // find the maximum from the array 
        int max = arr[0];
        for(int i =1; i<n; i++ ){
            if(max < arr[i]){
                max = arr[i];
            }

        }
        System.out.println();
        System.out.print("Maximum number is : " +  max);
        sc.close();
        
    }
    
}
