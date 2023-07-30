package array;

public class _00_array_intro {
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String args[]){
        int[] arr;
        arr = new int[5];
        arr[0] = 53;
        arr[1]= 33;
        arr[2]  = 44;
        arr[3] = 67;
        arr[4]  = 98;

        // triversal;
        for(int i = 0 ; i<arr.length;i++){
           // System.out.println(arr[i]);
        }
        //assingnment
        int[] two = arr;
        two[2] = 590;
         
        for(int i = 0 ; i<two.length; i++){
            //System.out.println(two[i]);
        
        }
        swap(arr, 0, 4);
        // same output of both two and arr
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    }
   
