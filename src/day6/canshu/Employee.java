package day6.canshu;

/**
 * @time : 2022/10/11 58
 * @author: bgcode
 */
public class Employee {
    private double salary;
    private String name;

    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;

    }

//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    //获取年工资方法
    public double getAnnual() {
        return salary * 12;
    }
}
