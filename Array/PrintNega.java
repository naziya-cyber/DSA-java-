package Array;
import java.util.Scanner;

public class PrintNega {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // print the negative from the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Element of the array : ");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println();

        // print 
        for(int i =0; i<n; i++){
            if(arr[i] <0)
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sc.close();

    }
    
}
