package day1;

/**
 * @time : 2022/10/8 31
 * @author: bgcode
 */
public class jjtable {//九九乘法表

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");

            }
            System.out.print("\n");
        }
    }

}
