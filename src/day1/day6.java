/**
 * @author : bgcode
 * @date:2022/10/3 10:39
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class day6 {

    public static void main(String[] args) {
        for (int i = 3; i >= 1; i--) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("请输入账号");
            String name = myScanner.next();
            System.out.println("请输入密码");
            int password = myScanner.nextInt();
            if (name.equals("丁真") && password == 666) {
                System.out.print("登陆成功");
                break;
            } else if (i > 1) {
                int sum = i - 1;
                System.out.print("登陆失败");
                System.out.print("你还剩下" + sum + "机会");
                continue;
            } else {
                System.out.print("登陆失败");
                break;
            }
        }
    }
}