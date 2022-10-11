package day6.poly;

/**
 * @time : 2022/10/11 10
 * @author: bgcode
 */
public class Teacher extends Person {
    private int salary;

    public Teacher(int age, String name, int salary) {
        super(age, name);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return super.say() + salary;
    }

    public void teach() {
        System.out.println("teach");
    }
}
