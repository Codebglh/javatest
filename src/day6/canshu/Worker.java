package day6.canshu;

/**
 * @time : 2022/10/11 11
 * @author: bgcode
 */
public class Worker extends Employee {
    public Worker(int salary, String name) {
        super(salary, name);
    }

    public void work() {
        System.out.println("Worker is working");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
