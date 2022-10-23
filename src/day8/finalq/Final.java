package day8.finalq;

/**
 * @time : 2022/10/22 02
 * @author: bgcode
 */
public class Final {
    public static void main(String[] args) {

    }
}

final class sddd {//不能被继承
    final String name = "sddd";//不能能被修改

    public final void hai(final String name) {//方法不能被重写
        System.out.println(name);
    }
}

