package day1;

/**
 * @time : 2022/10/8 08
 * @author: bgcode
 */
public class whilexunh {
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
