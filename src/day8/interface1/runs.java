package day8.interface1;

/**
 * @time : 2022/10/22 26
 * @author: bgcode
 */
public class runs {
    public static void main(String[] args) {
        phone phone = new phone();
        computer computer = new computer();
        computer.work(phone);
    }
}
