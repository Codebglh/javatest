/**
 * @date:2022/10/3 18:14
 * @author: bgcode
 */

public class day9 {
    public static void main(String[] args) {
        double[] hens = {1, 2, 3, 4, 12, 21, 11, 9, 3};//数组定义方法double[] hens = {1, 2, 3, 4};或double hens []= {1, 2, 3, 4};
        int x = 0;
        double max = hens[0];
        for (int i = 0; i < hens.length; i++) {
            if (max < hens[i]) {
                max = hens[i];
                x = i;
            }
        }
        System.out.println(max + "" + x);//找出数组中最大值

        char[] s = new char[26];
        for (int i = 0; i < s.length; i++) {
            s[i] = (char) ('a' + i);
            System.out.print(s[i]);//栈/堆数组/方法区内存
        }
        int arr[] = {1, 2, 3, 4};
        int arr2[] = new int[arr.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i];
        }
        arr2[1] = 100;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(arr2[i]);
        }
        int[] arr3 = {1, 2, 3, 4};
        int[] arr4 = new int[arr3.length];
        for (int i = arr4.length - 1, j = 0; i >= 0; j++, i--) {
            arr4[j] = arr3[i];
        }
        arr3 = arr4;
        for (int i = 0; i < arr4.length; i++) {

            System.out.print(arr3[i]);//动态替换数组
        }
    }
}