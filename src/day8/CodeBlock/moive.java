package day8.CodeBlock;

/**
 * @time : 2022/10/22 40
 * @author: bgcode
 */
public class moive {
    private String name;
    private String description;
    private double value;

    {
        System.out.println("name:  description: ");
    }//代码块被调用在构造器之前在每次初始化都被调用

    public void print() {
        System.out.println("name: ");
    }
}
