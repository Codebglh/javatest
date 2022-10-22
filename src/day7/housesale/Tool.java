package day7.housesale;

import java.util.Scanner;

/**
 * @time : 2022/10/15 37
 * @author: bgcode
 */
public class Tool {
    private static Scanner scanner = new Scanner(System.in);

    public String readString(String a) {
        return readKeyboard(11, "位电话号码");
    }


    public static char readChar() {
        char c;
        for (; ; ) {
            String s = readKeyboard(1, "1-6中任意字符");
            c = s.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6') {
                System.out.println("输入错误");
            } else break;
        }
        return c;
    }

//    public static String readString(int a, String b) {
//        return null;
//    }

    private static String readKeyboard(int a, String b) {
        String s;

        for (; ; ) {
            System.out.println("请输入" + a + b);
            s = scanner.next();

            if (s.length() != a) {
                System.out.println("请输入正确字符");
            } else break;


        }
        return s;
    }
}
