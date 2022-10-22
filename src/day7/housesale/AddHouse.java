package day7.housesale;

import java.util.Scanner;

/**
 * @time : 2022/10/15 09
 * @author: bgcode
 */
public class AddHouse {
    private String name;
    private String number;
    private String adress;
    private int salary;
    private String state;
    Scanner scanner = new Scanner(System.in);

    public void addhouse() {
        System.out.print("姓名");
        this.name = scanner.next();
        System.out.print("电话");
        this.number = scanner.next();
        System.out.print("地址");
        this.adress = scanner.next();
        System.out.print("月租");
        this.salary = scanner.nextInt();
        System.out.print("请输入状态(y已出租/n未出租)");
        String a = scanner.next();
        while (true) {
            if (a.equals("y") || a.equals("n")) {
                break;
            }
        }
        if (a.equals("y")) {
            this.state = "已出租";
            System.out.print("已出租");
        } else {
            this.state = "未出租";
            System.out.print("未出租");
        }

    }

}
