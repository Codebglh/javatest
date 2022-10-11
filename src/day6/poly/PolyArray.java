package day6.poly;

/**
 * @time : 2022/10/11 24
 * @author: bgcode
 */
public class PolyArray {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Person(1, "Tom");
        people[1] = new Student(2, "Jerry", 1212);
        people[2] = new Teacher(3, "Tom", 1212);
        people[3] = new Person(5, "Bob");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].say());
            if (people[i] instanceof Teacher) {
                ((Teacher) people[i]).teach();//向下转型
            }
        }
    }
}
