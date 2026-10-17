package org.example.array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Reverse Given Array");
        int[]  num ={12,44,55,36,87,99};
        reverseArray(num);
        System.out.println(Arrays.toString(num));
    }

    static void reverseArray(int[] num) {
        int start =0;
        int end = num.length-1;
        while (start<end){
            int temp = num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
}
