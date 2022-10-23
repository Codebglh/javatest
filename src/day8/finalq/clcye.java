package day8.finalq;

/**
 * @time : 2022/10/22 05
 * @author: bgcode
 */
public class clcye {
    public static void main(String[] args) {
        circle circle = new circle(3);
        System.out.println(circle.calculate());
        System.out.println(new circle(22).calculate());
    }
}

class circle {
    private final double pai;// = 3.14;
    private double r;


//     {
//        pai = 3.14;
//    }

    public circle(double r) {
        this.r = r;
        pai = 3.14;
    }

    public double calculate() {
        return pai * r * r;
    }

}