package day5.bag.extend;

/**
 * @time : 2022/10/10 04
 * @author: bgcode
 */
public class Student {
    public String name;
    public int age;
    private int score;

    public void info() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
    }

    public void setScore(int score) {
        this.score = score;
    }
}
