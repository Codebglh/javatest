package day5.bag.move;

/**
 * @time : 2022/10/10 12
 * @author: bgcode
 */
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.suml());
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getl() + 10;//getl() 即为动态绑定调用B类中的方法获得值
    }

    public int suml() {
        return i + 10;
    }

    public int getl() {
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

//    public int suml() {
//        return i + 10;
//    }

    public int getl() {
        return i;
    }
}
