package day2;

/**
 * @time : 2022/10/8 02
 * @author: bgcode
 */
public class object1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "John";
        cat1.age = 22;
        cat1.color = "blue";
//        Cat cat2 = new Cat();
//        cat2.name = "Tom";
//        cat2.age = 23;
//        cat2.color = "red";
//        System.out.print(cat1.name + "\t" + cat1.age + "\t" + cat2.color);
        Cat ss = new Cat();
        ss = cat1;
        System.out.print(ss.name + "\t" + ss.age);
        ss.color = "green";
        System.out.print(cat1.color + "\t");
    }
}

class Cat {
    String name;
    int age;
    String color;
}