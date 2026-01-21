package Array;

public class WaveArr17 {
    // most imp thing is that array is sorted 
    public static void main(String[] args) {
        //  int[] arr = {1, 2, 3, 4 ,5 , 6, 7, 8, 9, 10};
        int[] arr = {1, 2, 3, 4, 5};
         for(int i =0; i<arr.length-1; i+=2){
            // swap
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
         }
         for(int ele : arr){
            System.out.print(ele + "  ");
         }
        
        
    }
}
