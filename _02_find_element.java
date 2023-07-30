package array;

import java.util.Scanner;

public class _02_find_element {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr  = new int[n];
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int flag = 0;
        int index = 0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] ==  element){
                flag = 1;
                index = i;
                break;

            }
        }
        if(flag ==0){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found on index");
            System.out.println(index);
        }
    }
}
