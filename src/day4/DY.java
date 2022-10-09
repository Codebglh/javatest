package day4;

/**
 * @time : 2022/10/9 00
 * @author: bgcode
 */
public class DY {
    //java中允许同一个类中，多个同名方法存在，但要求形参列表不一致叫重载
    public void print(int c) {
        System.out.print(c);
    }

    public void print(String c) {
        System.out.print(c);
    }

    public void print(char c) {
        System.out.print(c);
    }

    public void print(boolean c) {
        System.out.print(c);
    }

    public void print(int[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }

    public void print(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }

    public void print(int cs, char c, String... out) {
        System.out.print(cs);
        //类型加... 加形参为可变参数可用数组方式进行运算可看成数组
        //可变参数必须放在最后
    }
}
