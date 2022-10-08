/**
 * @date:2022/10/4 22:51
 * @author: bgcode
 */
public class day2 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.speak();
//        person.ca(20);
        int i = 20;
        i = person.ca1(i);
        System.out.println(i);
    }
}

class Person {
    String name;
    int age;

    public void speak() {
        System.out.print("我是一个好人");
    }

    public void ca(int n) {
        System.out.println((n + 20));

    }

    public int ca1(int n) {
        n += 20;
        return n;
    }
}