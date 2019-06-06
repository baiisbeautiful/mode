package cn.algorithm;

import java.security.PublicKey;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/5 9:22
 **/
public class FastSort {
    public static void main(String[] args) {
        int[] a = {12, 20, 5, 16, 15, 1, 30, 45, 23, 9,4,4 };
        int min = 0;
        int max = a.length - 1;
        sort(a, min, max);
        for (int i : a) {
            System.out.print(i+"-");
        }

    }

    public static void sort(int[] a, int min, int max) {
        int key = a[min];
        int start = min;
        int end = max;
        while (start < end) {
            while (end > start && a[end] >= key) {
                //如果找到的值大于基数值，那么继续往下找，end--
                end--;
            }
            if(a[end]<key){
                int temp=a[end];
                a[end]=a[start];
                a[start]=temp;
            }
            //从前往后找
            while (end > start && a[start] <= key) {
                //如果找到的值小于基数值，那么继续往下找，start++
                start++;
            }
            if(a[start]>key){
                int temp=a[end];
                a[end]=a[start];
                a[start]=temp;
            }
        }
        if (start > min) {
            sort(a, min, start - 1);
        }
        if (end < max) {
            sort(a, end + 1, max);
        }
    }


}
