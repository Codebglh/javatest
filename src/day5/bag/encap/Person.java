package day5.bag.encap;

/**
 * @time : 2022/10/10 52
 * @author: bgcode
 */
public class Person {
    public String name;
    public String job;
    private int age;
    private double income;

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6

        ) {
            this.name = name;
        } else {
            System.out.println("错误名称");
            this.name = "wuming";
        }
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Age must be between 1 and 100");
            this.age = 18;
        }
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }

    public void info() {
        System.out.print(name + " " + age + " " + job);
    }
}

class a {
    public static void main(String[] args) {
        Person ass = new Person();
        ass.setAge(222);
        ass.setName("sd");
        ass.setJob("sds");
        ass.setIncome(46454);
        ass.info();
        System.out.print(ass.getIncome());
    }
}