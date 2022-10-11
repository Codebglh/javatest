package day6.canshu;

/**
 * @time : 2022/10/11 03
 * @author: bgcode
 */
public class test {
    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        employee[0] = new Employee(1, "dsfs");
        employee[1] = new Worker(2, "dsfs");
        employee[2] = new Manage(3, "dsfs", 54646);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] instanceof Worker) {
                System.out.println(employee[i].getAnnual());
            } else if (employee[i] instanceof Manage) {
                System.out.println(employee[i].getAnnual());
            } else {
                System.out.println(employee[i].getAnnual());
            }
        }
        String i = "0";
        int j = 0;
        if (i.equals(j)) {

        }
    }
}
