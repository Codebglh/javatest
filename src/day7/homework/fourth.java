package day7.homework;

/**
 * @time : 2022/10/14 17
 * @author: bgcode
 */
public class fourth {
    public static void main(String[] args) {
        worker1[] worker11 = new worker1[5];
        worker11[0] = new Teacher(100, 2, 2000);
        worker11[1] = new Scientist(222, 222);
        worker11[2] = new worker2(3000);
        worker11[3] = new worker2(3000);
        worker11[4] = new worker2(3000);
        for (int i = 0; i < 5; i++) {
            worker11[i].pri();
        }
    }

}

class worker1 {
    private double salary;

    public worker1(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void pri() {
        System.out.println(salary);
    }
}

class worker2 extends worker1 {
    public worker2(double salary) {
        super(salary);
    }

}

class Teacher extends worker1 {
    private int day;
    private double sal1;

    public Teacher(double salary, int day, double sal1) {
        super(salary);
        this.day = day;
        this.sal1 = sal1;
    }

    @Override
    public void pri() {
        System.out.println(sal1 * day + super.getSalary());
    }
}

class Scientist extends worker1 {
    private double bonus;

    public Scientist(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }

    @Override
    public void pri() {
        System.out.println(this.bonus + super.getSalary());
    }
}