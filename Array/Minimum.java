package Array;
import java.util.Scanner;

public class Minimum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        // input the array 
        for(int i =0; i<arr.length; i++){
            System.out.print(i + "th element : ");
            arr[i] = sc.nextInt();
        }
        //search the minimum of the array 
        int mini = arr[0];
        for(int i = 1; i< arr.length; i++){
            if(mini > arr[i]){
                mini = arr[i];
            }
        }
        System.out.println();
        System.out.println("Minimum from the array is : " + mini);

        sc.close();

    }
    
}
