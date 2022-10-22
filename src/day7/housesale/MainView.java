package day7.housesale;

import java.util.Scanner;

/**
 * @time : 2022/10/15 00
 * @author: bgcode
 */
public class MainView {

    private boolean loop = true;
    private String detail = "——————————————————房屋出租系统——————————————————\n\t\t1 新 增 房 源\n\t\t2 查 找 房 源\n\t\t3 删 除 房 屋\n\t\t4 修 改 房 屋 信 息\n\t\t5 房 屋 列 表\n\t\t6 退      出";
    Scanner scanner = new Scanner(System.in);

    public void main() {
        do {
            System.out.println(this.getDetail());
            switch (scanner.nextInt()) {
                case 1:
                    new AddHouse().addhouse();
                    break;
                case 2:
                    System.out.println("查 找");
                case 3:
                    System.out.println("删 除");
                case 4:
                    System.out.println("修 改");
                case 5:
                    System.out.println("房 屋");
                case 6:
                    loop = false;
                    break;
            }
        }
        while (loop);
    }


    public String getDetail() {
        return detail;
    }


}
