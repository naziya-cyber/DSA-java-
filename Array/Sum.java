package Array;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        
        // input 
       
        for(int i = 0; i< arr.length; i++){
            System.out.println("Enter the " + i + "th element of the array : ");
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // print the sum of the array 
        int sum = 0;
        for(int i =0; i< arr.length; i++){
            sum += arr[i];
        }
        System.out.println();
        System.out.println("Sum of the array is : " + sum);
        
        sc.close();
        
        
    }
}
