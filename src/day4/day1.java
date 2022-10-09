package day4;

/**
 * @time : 2022/10/9 07
 * @author: bgcode
 */
public class day1 {

    int age = 10;

    public void age1() {
        age = 11;
        System.out.print(age);
    }

    public void age2() {
        System.out.print((age++));
    }

    public void age3() {
        int j = age++;
        System.out.print(j);
        System.out.print(age);
    }

    public static void main(String[] args) {
        new day1().age1();//new Object()创建一个匿名对象，只能被使用一次在方法中已经被使用
        day1 ss = new day1();
        ss.age2();
        ss.age2();
        ss.age3();
        day1 ss1 = ss;
        System.out.print(ss1.age);

    }
}
