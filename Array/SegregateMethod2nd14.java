package Array;

public class SegregateMethod2nd14 {
    public static void main(String[] args){
        
        int[] arr = {0, 0,1, 0, 1, 1, 0, 0, 1, 0, 1, 1};
        int n = arr.length;

        int i = 0;// mistake i was doing is arr[0] instead of i = 0;
        int j = n-1;
        while(i<j){
            
        }

      for(int a = 0; a <= n; a++){
            System.out.print(arr[a] + "  ");
        }  if(arr[i] == 0){
            i++;
        }else if(arr[j] == 1){
            j++;
        }else{
            // swap 
            arr[i] = 0;
            arr[j] = 1;
            i++;
            j--;
        }
        
        // print
        for(int ele : arr){
            System.out.print( ele + "  ");
        }

    }
    
}
