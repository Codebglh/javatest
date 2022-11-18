package eleven.seventeen;

/**
 * @time : 2022/11/17 29
 * @author: bgcode
 */
public class Student {
    private String number;
    private String name;
    private int math = 22;
    private int english = 11;
    private int computer = 111;

    public double sum() {
        double a;
        a = math + english + computer;
        return a;
    }

    public double average() {

        return sum() / 3;

    }

    public double min() {
        if (math < english && math < computer) {
            return math;
        } else if (math > computer && english > computer) {
            return computer;
        } else {
            return english;
        }

    }
}

class sum {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.print(student.min());

    }
}