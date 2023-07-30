package array;

import java.util.Scanner;

public class _06_reverse_array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int[] r_array  = new int[n];

        int i = arr.length -1;
        int k = 0;
        while(i>=0){
            int d = arr[i];
            r_array[k] = d;
            i--;
            k++;
        }
        for(int j = 0 ; j<r_array.length;j++){
            System.out.print(r_array[j]);
        }
    }
    
}
