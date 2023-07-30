package array;

import java.util.Scanner;


public class _05_difference_of_array {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];

        for(int i=0;i<n1;i++){
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];

        for(int i=0;i<n2;i++){
            a2[i] = sc.nextInt();
        }

        int c = 0;
        int i = a1.length -1;
        int j = a2.length -1;
        int[] sum = new int[n1>n2?n1:n2];
        int k = sum.length -1;
        
        while(k>=0){
            int a1v = i>=0?a1[i]:0;
            int d1 = a1v;
            int d2 = a2[j];
            int d = 0;
            if(d2+c>d1){
                d = d2+c-d1;
                c =0;
            }
            else{
                d = d2+c+10-d1;
                c  = -1;
            }
            sum[k] = d;
            i--;
            j--;
            k--;

        }
        int index = 0;
        while(index <sum.length){
            if(sum[index] == 0){
                index++;
            }
            else{
                break;
            }
        }
        while(index<sum.length){
            System.out.println(sum[index]);
            index++;
        }
        System.out.println(sum);
    }
    
}
