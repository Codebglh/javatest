package day4;

/**
 * @time : 2022/10/9 55
 * @author: bgcode
 */
public class ss {

    public static void main(String[] args) {
        person p1 = new person("li", 60);
        System.out.print(p1.name + p1.age);
//        person p = new person();
    }
}

class person {
    String name;
    int age;

    public person(String names, int ages) {
        name = names;
        age = ages;
    }
}

