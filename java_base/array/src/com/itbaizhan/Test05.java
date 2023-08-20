package com.itbaizhan;

// 测试Arrays类
import java.util.Arrays;
public class Test05 {
    public static void main(String[] args) {
//        int[] a = {1,2};
//        System.out.println(a);  // 打印数组引用的值
//
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//        }
//
//        System.out.println(Arrays.toString(a));  // 打印数组元素的值

        /* 使用Arrays类对数组元素进行排序 */
        int[ ] a = {1,2,323,23,543,12,59};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        /* 使用Arrays类实现二分法查找法 */
        //返回排序后新的索引位置,若未找到返回负数。
        System.out.println("该元素的索引："+Arrays.binarySearch(a, 12));

        /* 使用Arrays类对数组进行填充 */
        Arrays.fill(a, 2, 4, 100); //将2到4索引的元素替换为100;
        System.out.println(Arrays.toString(a));
    }
}
