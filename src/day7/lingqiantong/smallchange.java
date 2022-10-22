package day7.lingqiantong;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @time : 2022/10/13 56
 * @author: bgcode
 */
public class smallchange {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String detail = "----------零钱明细-----------";
        double money = 0;//入账
        double sum = 0;//累计所有
        Date date = new Date();//日期获取
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd  HH:mm");
        do {
            System.out.println("========零钱通========");
            System.out.println("输入 1  零钱明细");
            System.out.println("输入 2  添加存款");
            System.out.println("输入 3  消   费");
            System.out.println("输入 4  退   出");
            System.out.println("选择（1-4）");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println(detail);
                    break;
                case 2:
                    System.out.println("请输入金额");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("请输入正确金额");
                        break;
                    }
                    sum += money;
                    detail += "\n收益入账\t+" + money + "\t" + format.format(date) + "\t余额\t" + sum;
                    break;
                case 3:
                    System.out.println("请输入金额");

                    money = scanner.nextDouble();
                    if (money <= 0 || money >= sum) {
                        System.out.println("请输入正确金额");
                        break;
                    }
                    sum -= money;
                    System.out.println("请输入消费说明");
                    String note = scanner.next();
                    detail += "\n" + note + "\t-" + money + "\t" + format.format(date) + "\t余额\t" + sum;
                    break;
                case 4:
                    String choice;
                    while (true) {
                        System.out.println("你确定要退出吗？ y/n");
                        choice = scanner.next();
                        if (choice.equals("y") || choice.equals("n")) {
                            break;
                        }
                    }//功能拆分提高扩展性
                    if (choice.equals("y")) {
                        System.out.println("正在退出.....");
                        loop = false;
                        break;
                    } else {
                        break;
                    }

                default:
                    System.out.println("输入有误，请从新输入");
                    continue;
            }
        } while (loop);
    }
}
