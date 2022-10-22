package day7.homework;

/**
 * @time : 2022/10/14 44
 * @author: bgcode
 */
public class Second {
    public static void main(String[] args) {
        porfessor porfessor = new porfessor("ds", "Sds", 22, 100, 1.3);
    }
}

class teacher {
    private String name;
    private String post;
    private int age;
    private int salary;
    private double grade;

    public teacher(String name, String post, int age, int salary, double grade) {
        this.name = name;
        this.post = post;
        this.age = age;
        this.salary = salary;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void introduce() {
        System.out.print("姓名" + this.name + "年龄" + this.age + "职位" + this.post + "工资" + this.salary);
    }
}

class porfessor extends teacher {

    public porfessor(String name, String post, int age, int salary, double grade) {
        super(name, post, age, salary, grade);

    }


    @Override
    public void introduce() {
        System.out.print("级别" + getGrade());
        super.introduce();

    }
}