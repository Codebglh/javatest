package day4;

/**
 * @time : 2022/10/9 28
 * @author: bgcode
 */
public class homework1 {


    public static void main(String[] args) {

        homework2 w = new homework2();
        System.out.println(w.method(w.method(10, 10), 10));

    }
}

class homework2 {
    public double method(double a, double b) {
        return a + b;
    }
}