/**
 * @date:2022/10/4 17:33
 * @author: bgcode
 */

import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
//        String[] names = {"大王", "大姐", "大嫂", "大哥"};
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Enter your name: ");
//        String name = myScanner.next();
//        int b = -1;
//        for (int i = 0; i < names.length; i++) {
//            if (name.equals(names[i])) {
//                System.out.println(" is a " + names[i]);
//                System.out.println(" 找到下标为" + i + "的值");
//                b = i;
//                break;
//            }
//
//        }
//        if (b == -1) {
//            System.out.println(" is not a name");
//        }
//        int[] names = {1, 2, 3};
//        int[] name = new int[names.length + 1];
//        for (int i = 0; i < names.length; i++) {
//            name[i] = names[i];
//        }
//        name[names.length] = 8;
//        names = name;
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
        int arr[] = {1, 2, 3, 4};
        int arr1[] = new int[arr.length - 1];
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr.length - 3) {
                arr1[i] = arr[arr.length - 1];
                continue;
            } else {
                arr1[i] = arr[i];
            }
        }


        arr = arr1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}