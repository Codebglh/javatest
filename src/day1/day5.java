/**
 * @date:2022/10/3 01:33
 * @author : bgcode
 */

import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入打印空心三角的层数");
        int high = scanner.nextInt();

        for (int j = 1; j <= high; j++) {
            for (int x = 0; x <= high - j; x++) {
                System.out.print("\s");
            }

            for (int i = 1; i <= j * 2 - 1; i++) {
                if (i == 1 || i == 2 * j - 1 || j == high) {
                    System.out.print("*");
                } else {
                    System.out.print("\s");
                }
            }
            System.out.print("\n");
        }
        System.out.print("高为" + high + "层的空心三角已打印");
    }
}