package Array;
import java.util.Scanner;

public class TenSecMaximumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {23, 34, 99, 100, 56, 2, 12, 45, 56};
        // first maximum munber 
        int max = arr[0];
        int max2 =  arr[1];   // assume 

        for(int i =1; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        // find the second maximum number 
        for(int i = 0; i<arr.length; i++){
            if(max2 < arr[i] && arr[i] != max){
                max2 = arr[i];
            }
        }
        System.out.println("Maximum number is : " + max);
        System.out.println("Second maximum numner is : " + max2);
        sc.close();

    }
    
}
