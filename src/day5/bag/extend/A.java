package day5.bag.extend;

/**
 * @time : 2022/10/10 41
 * @author: bgcode
 */
public class A {
    A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a.name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }

    public B(String name) {
        super("sss");//指定父类构造器
        System.out.println("b.name");
    }
}

class C {
    public static void main(String[] args) {
        B b = new B();
    }
}