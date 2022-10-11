package day6.canshu;

/**
 * @time : 2022/10/11 12
 * @author: bgcode
 */
public class Manage extends Employee {
    private int bonus;

    public Manage(int salary, String name, int bonus) {
        super(salary, name);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("Manage");
    }

    public void bonus() {
        System.out.println("Bonus");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
