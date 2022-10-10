package day5.bag.encap;

/**
 * @time : 2022/10/10 56
 * @author: bgcode
 */
public class Account {
    public String name;
    private int income;
    private String password;

    public Account(String name, int income, String password) {
        this.setName(name);
        this.setIncome(income);
        this.setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 1 && name.length() <= 3) {
            this.name = name;
        } else {
            System.out.println("Invalid name: ");
            this.name = "sd";
        }
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        if (income > 20) {
            this.income = income;
        } else {
            System.out.println("Invalid income: >20");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() == 6) {
            this.password = password;
        } else {
            this.password = "1sdads";
        }
    }

    public void info() {
        System.out.println("Name: " + this.name);
        System.out.println("Income: " + this.income);
        System.out.println("Password: " + this.password);
    }
}
