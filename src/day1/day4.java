/**
 * @author : bgcode
 * @date:2022/10/2 13:55
 */

import java.util.Scanner;

public class day4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double a = 0;//累计所有学生成绩
        int d = 0;//累计所有及格人数
        for (int i = 1; i <= 3; i++) {
            double sum = 0;//累计所有
            int de = 0;//班及格人数
            for (int j = 1; j <= 5; j++) {
                System.out.println("请输入第 " + i + "个班的第 " + j + "个学生的成绩");
                double score = myScanner.nextDouble();
                if (score > 60) {
                    d++; //d及格人数
                    de++;
                }
                sum += score;
                System.out.println("成绩为" + score);
            }
            a += sum;
            System.out.println("第" + i + "班的平均分为" + sum / 5 + "总成绩为" + sum + "及格人数为" + de);

        }
        System.out.println("总分为" + a + "总平均分为" + a / 15 + "总及格人数为" + d);
    }
}
