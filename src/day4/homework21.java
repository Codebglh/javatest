package day4;

/**
 * @time : 2022/10/9 26
 * @author: bgcode
 */
public class homework21 {
    public static void main(String[] args) {
        gs ws = new gs("lic", "sda", 60, "fg", 22);
        System.out.println(ws.age + ws.gender + ws.name + ws.city + ws.email);
    }
}

class gs {
    String name;
    String gender;
    int age;
    String city;
    int email;

    public gs(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public gs(String city, int email) {
        this.city = city;
        this.email = email;
    }

    public gs(String name, String gender, int age, String city, int email) {
        this(name, gender, age);
        new gs(city, email);

    }
}
