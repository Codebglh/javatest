/**
 * @date:2022/10/5 21:28
 * @author: bgcode
 */

import java.util.Scanner;

public class day6 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        MyTool a = new MyTool();
//        int x = a.fb(n);
//        int k = a.hz(n);
//        System.out.println(k);
        int[][] d = new int[8][7];
        for (int i = 0; i < 7; i++) {
            d[0][i] = 1;
            d[d.length - 1][i] = 1;
        }
        for (int i = 1; i < 8; i++) {
            d[i][0] = 1;
            d[i][6] = 1;
        }
        for (int i = 1; i < 3; i++) {
            d[3][i] = 1;
        }
        a.findway(d, 1, 1);
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(d[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
