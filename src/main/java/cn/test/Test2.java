package cn.test;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/3 10:00
 **/
public class Test2 {
    public static void main(String[] args) {
        LinkedList<Integer> arr3 = new LinkedList<>();
        arr3.add(1);
        arr3.add(2);
        arr3.add(4);
        System.out.println(arr3);

        LinkedList<Integer> arr2 = new LinkedList<>();
        arr2.add(1);
        arr2.add(3);
//        arr2.add(7);
        arr2.add(4);
        System.out.println(arr2);
        arr2.addAll(arr3);
        arr2.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(arr2);
    }

}
