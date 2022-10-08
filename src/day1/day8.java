/**
 * @date:2022/10/3 15:21
 * @author: bgcode
 */
//char定义的是单引号''也能表示数
public class day8 {
    public static void main(String[] args) {
        char x = 'a';
        int y = x + 1;

        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        for (char v = 'Z'; v >= 'A'; v--) {
            System.out.print(v);
        }
    }
}