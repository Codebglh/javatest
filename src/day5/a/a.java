package day5.a;


/**
 * @time : 2022/10/9 13
 * @author: bgcode
 */
public class a {
    public int n1 = 100;
    private int n2 = 1;//在同一个包中不能访问
    protected int n3 = 10;
    int n4 = 1000;

    public void m1() {
        System.out.println(n1 + n2 + n3 + n4);
    }
}
