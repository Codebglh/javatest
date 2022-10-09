package day4;

import java.util.Random;
import java.util.Scanner;

/**
 * @time : 2022/10/9 17
 * @author: bgcode
 */
public class cq {
    public static void main(String[] args) {
        System.out.println("请输入三次出拳0-✊，1-✂️，2-👋");
        Scanner scanner = new Scanner(System.in);
        Random aaa = new Random();
        int[] a = new int[3];
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
            n[i] = aaa.nextInt(3);
        }
        Tom aq = new Tom();
        aq.js(a, n);
        int[][] c = aq.all;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(c[i][j] + "  ");
            }
            if (c[i][2] == 3) {
                System.out.print("输");
                sum1 += 1;
            } else if (c[i][2] == 4) {
                System.out.print("赢");
                sum += 1;
            } else {
                System.out.print("平");
            }
            System.out.println();
        }
        System.out.println("赢的局数为" + sum + "输的局数为" + sum1);

    }
}

class Tom {
    int[][] all = new int[3][3];

    public void js(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0 && b[i] == 1) {
                all[i][0] = a[i];
                all[i][1] = b[i];
                all[i][2] = 4;
            } else if (a[i] == 1 && b[i] == 2) {
                all[i][0] = a[i];
                all[i][1] = b[i];
                all[i][2] = 4;
            } else if (a[i] == 2 && b[i] == 0) {
                all[i][0] = a[i];
                all[i][1] = b[i];
                all[i][2] = 4;
            } else if (a[i] == 1 && b[i] == 0) {
                all[i][0] = a[i];
                all[i][1] = b[i];
                all[i][2] = 3;
            } else if (a[i] == 2 && b[i] == 1) {
                all[i][0] = a[i];
                all[i][1] = b[i];
                all[i][2] = 3;
            } else if (a[i] == 0 && b[i] == 2) {
                all[i][0] = a[i];
                all[i][1] = b[i];
                all[i][2] = 3;
            } else {
                all[i][0] = a[i];
                all[i][1] = b[i];
                all[i][2] = 5;
            }
        }
    }

}
