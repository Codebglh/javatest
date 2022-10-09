package day4;

/**
 * @time : 2022/10/9 18
 * @author: bgcode
 */
public class homework13 {
    public static void main(String[] args) {
        Cricle sss = new Cricle();
        PassObject ss = new PassObject();
        ss.printss(sss, 5);
    }

}

class Cricle {
    double r;

    public double findarea(double r) {
        return r * Math.PI * r;
    }
}

class PassObject {
    public void printss(Cricle c, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(c.findarea(i));
        }
    }
}
