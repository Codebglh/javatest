/**
 * @date:2022/10/3 12:09
 * @author: bgcode
 */
public class day7 {
    public static void main(String[] args) {
        int x = 100000, k = 0;
        while (x > 50000) {
            x -= x * 0.05;
            k++;
        }
        while (1000 <= x) {
            x -= 1000;
            k++;
        }
//        int x = 153;
//        x = x % 100 / 10;
        System.out.println(k);
    }
}
