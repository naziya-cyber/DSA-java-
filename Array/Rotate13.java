package Array;
import java.util.Scanner;

public class Rotate13 {
    public static void  Reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

    }
    public static void Print(int[] arr){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ "  ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = {6, 8, 1, 2, 4, 9, 0};
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9, 10};
        System.out.print("How many times you want to rotate: ");
        int d = sc.nextInt();
        //Reverse upper part
        Reverse(arr,0, d-1);
        Print(arr);
        System.out.println();

        //Reverse lower part
        Reverse(arr, d,arr.length-1);
        Print(arr);
        System.out.println();

        //Reverse the whole arr
        Reverse(arr, 0, arr.length-1);
        Print(arr);
        System.out.println();



        sc.close();
    }
    
}
