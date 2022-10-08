/**
 * @date:2022/10/2 14:20
 * @author: bgcode
 */
//九九乘法口诀表
public class day3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");

            }
            System.out.print("\n");
        }
    }

}