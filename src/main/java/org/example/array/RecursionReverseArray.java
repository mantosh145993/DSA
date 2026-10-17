package org.example.array;
import java.util.Arrays;

public class RecursionReverseArray {
    public static void main(String[] args) {
        int[] num = {25,41,78,36,45,14,25,88,177};
        int len= num.length-1;
        recursionReverse(num,0, len);
        System.out.println(Arrays.toString(num));
    }

    static void recursionReverse(int[] num, int start, int end){
        if (start >= end){
            return;
        }
        int temp = num[start];
        num[start]=num[end];
        num[end]=temp;
        recursionReverse(num,start+1 , end-1);
    }
}
