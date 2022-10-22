package day7.homework;

/**
 * @time : 2022/10/13 06
 * @author: bgcode
 */
public class first {
    public static void main(String[] args) {
        person[] person1 = new person[3];
        person1[0] = new person("sadd", 454, "sd");
        person1[1] = new person("sadd", 44, "sd");
        person1[2] = new person("sadd", 11, "sd");
        person tm;
        for (int i = 0; i < person1.length - 1; i++) {
            for (int j = 0; j < person1.length - 1 - i; j++) {
                if (person1[j].getAge() < person1[j + 1].getAge()) {//冒泡排序按年纪由大到小排列
                    tm = person1[j];
                    person1[j] = person1[j + 1];
                    person1[j + 1] = tm;
                }
            }
        }
        for (int i = 0; i < person1.length; i++) {
            System.out.println(person1[i]);
        }
    }
}


class person {
    String name;
    int age;
    String job;

    public person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }


}

