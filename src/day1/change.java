package day1;

import java.util.Scanner;

/**
 * @time : 2022/10/8 54
 * @author: bgcode
 */
public class change {
    public static void main(String[] args) {
        //变量有三要素：（类型，名称，值）
        int a = 2;
//       print(a);
        switch (a) {
            case 2:
                print("aa");
                break;
            case 3:
                System.out.print(a);
                break;
        }

    }


    public static void print(String a) {

        System.out.print(a);
    }

    public static void x(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your choice:");
        char c = scanner.next().charAt(0);
//        String c = "a";
        switch (c) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            default:
                System.out.println("你输入有误");
        }
//
        System.out.println("Please input your score:");
        double score = scanner.nextDouble();//
        if (score >= 0 && score <= 100) {
            switch ((int) (score / 10)) {
                case 8 | 9:
                    System.out.println("A");
                    break;
                case 6 | 7:
                    System.out.println("B");
                    break;
                default:
                    System.out.println("C");
            }
        } else {
            System.out.println("你输入有误");
        }
    }


}
