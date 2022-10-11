package day6.poly;

/**
 * @time : 2022/10/11 43
 * @author: bgcode
 */
public class Student extends Person {
    public int score;

    public Student(int age, String name, int score) {
        super(age, name);
        this.score = score;
    }
    

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String say() {
        return super.say() + "\t" + score;
    }
}
