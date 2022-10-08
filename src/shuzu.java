/**
 * @time : 2022/10/6 49
 * @author: bgcode
 */
public class shuzu {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        Shuzu1 b = new Shuzu1();
        Shuzu1 c = new Shuzu1();
        b.age = 1;
        c.age = 2;
        System.out.println((c.age));
    }
}

class Shuzu1 {
    int age;
    String name;
    int high;

}