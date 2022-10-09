package day4;

/**
 * @time : 2022/10/9 10
 * @author: bgcode
 */
public class Homework {
    public static void main(String[] args) {
        Dog dog1 = new Dog("ming", 22, "blue");
        Dog dog2 = new Dog("jerry", 2, "red");
        dog1.showDog();
        dog2.showDog();
    }
}

class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void showDog() {
        System.out.println("小狗名" + this.name + "小狗年龄" + this.age + "小狗颜色" + this.color);
    }
}
