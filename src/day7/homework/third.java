package day7.homework;

/**
 * @time : 2022/10/14 57
 * @author: bgcode
 */
public class third {
    public static void main(String[] args) {
        manager manager = new manager("s", 100, 23);
        manager.pr();

    }
}

class worker {
    private String name;
    private double salary;
    private int days;


    public worker(String name, double salary, int days) {
        this.name = name;
        this.salary = salary;
        this.days = days;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }


    public void pr() {
        System.out.println(days * salary);
    }
}

class manager extends worker {
    private double grade = 1.2;

    public manager(String name, double salary, int days) {
        super(name, salary, days);
    }


    @Override
    public void pr() {
        System.out.println(super.getDays() * super.getSalary() * grade + 1000);
    }
}

class manner extends worker {
    private double grade = 1.0;

    public manner(String name, double salary, int days, double grades) {
        super(name, salary, days);
    }

    @Override
    public void pr() {
        System.out.println(super.getDays() * super.getSalary() * grade);
    }
}