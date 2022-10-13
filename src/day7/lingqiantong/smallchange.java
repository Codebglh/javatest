package day7.lingqiantong;

import java.util.Scanner;

/**
 * @time : 2022/10/13 56
 * @author: bgcode
 */
public class smallchange {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("========零钱通========");
            System.out.println("输入 1  零钱明细");
            System.out.println("输入 2  添加存款");
            System.out.println("输入 3  消   费");
            System.out.println("输入 4  退   出");
            System.out.println("选择（1-4）");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("========零钱明细========");
                    System.out.println("输入 2  添加存款");
                    continue;
                case 2:
                    continue;
                case 3:

                    System.out.println("输入 1  退");
                    System.out.println("输入 2  出");
                    continue;
                case 4:
                    System.out.println("输入 1  退");
                    System.out.println("输入 2  出");
                    break;
                default:
                    System.out.println("输入有误，请从新输入");
                    continue;
            }
        } while (loop);
    }
}
