package array;

import java.util.Scanner;

public class _07_rotate_array {
    public static int[] reverse(int i , int j, int[] arr){
        while(i>j){
            int temp = arr[i];
            arr[j] = arr[i];
            arr[i] = temp;
        }
 
        return arr;
    }
    public static int[] rotate(int[] arr, int k){
        k = k%arr.length;
        if(k<0){
            k = k+arr.length;
        }
        int[] d= reverse(0, arr.length-k-1, arr);
        int[] d1  = reverse(arr.length-k, arr.length-1, arr);
        int[] result  = new int[d.length+d1.length];
        System.arraycopy(d, 0, result,0, d.length);
        System.arraycopy(d1, 0, result, 0, d1.length);
        int[] f_result = reverse(0, result.length, result);
        return f_result;
    }
    public static void main(String args[]){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        Scanner sc = new Scanner(System.in);
        int k  = sc.nextInt();
       
       
        int[] r_arr = rotate(arr,k);
        for(int i =0;i<r_arr.length;i++){
            System.out.println(r_arr[i]);
        }
    }
}
