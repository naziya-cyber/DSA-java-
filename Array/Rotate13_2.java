package Array;
//!  Ques is you have to rotate the arr from the right side
// arr = {1, 2, 3, 4, 5, 6, 7,8,9};
// k = 3
public class Rotate13_2 {
    public static void Reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }

    // print 
    public static void Print(int[] arr, int length){
        for(int i =0; i<length; i++){
            System.out.print(arr[i]+ "  ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7,8, 9};
        int k = 3;

        int length = arr.length;
        int start_idx = length-k;
        k %= length;    // what if the rotation is greater than the arr
        if(k == 0) return;

        Reverse(arr, start_idx, length-1);
        Print(arr,length);

        Reverse(arr, 0, start_idx-1);
        Print(arr,length);

        Reverse(arr, 0, length -1);
        Print(arr,length);


   
    }
    
}
