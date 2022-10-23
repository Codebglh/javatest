package day8.single;

/**
 * @time : 2022/10/22 18
 * @author: bgcode
 */
public class first {
    public static void main(String[] args) {
        second a = second.getSecond1();
//        System.out.println(a.getA());
        System.out.println(a.a);
    }
}

class second {
    public int a = 2;

    private second() {
    }

    private static second second1 = new second();

    public int getA() {
        return a;
    }

    public static second getSecond1() {

        return second1;
    }
}
