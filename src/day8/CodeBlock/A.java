package day8.CodeBlock;

/**
 * @time : 2022/10/22 42
 * @author: bgcode
 */
public class A {
    public static void main(String[] args) {
        B b = new B();
    }
}

class B {
    private static int ID = 1;

    {
        System.out.println("nam22e:");

    }

    static {
        System.out.println("name:");

    }


}
