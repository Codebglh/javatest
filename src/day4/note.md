#### 1.方法的重载

```java
public class DY {
    //java中允许同一个类中，多个同名方法存在，但要求形参列表不一致叫重载
    public void print(int c) {
        System.out.print(c);
    }

    public void print(String c) {
        System.out.print(c);
    }

    public void print(char c) {
        System.out.print(c);
    }

    public void print(boolean c) {
        System.out.print(c);
    }

    public void print(int[] c) {
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }
        System.out.println();
    }

    public void print(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }


}
```

#### 2.可变参数

```java
public class Test {
    public void print(int cs, char c, String... out) {
        System.out.print(cs);
        //类型加... 加形参为可变参数可用数组方式进行运算可看成数组
        //可变参数必须放在最后
        //只能存在一个形参
    }
}
```

#### 3.作用域

成员变量，局部变量 全局变量

全局变量不必赋值，局部变量必须赋值

局部变量与全局变量可以重名访问遵循就近原则；不能重复定义变量在同一方法类或同一类中的属性

全局变量可以通过声明被对象调用，而局部变量不能被调用只能被本类方法使用

全局变量可以加修饰符[public,protected,private..]，而局部变量不能

```java
public class aa {
    int aa;//全局变量在这个类中也叫属性

    public void print() {
        int age = 0;//局部变量在这个方法中　　
    }
}

```

#### 4.构造器

1.构造器的修饰符可以默认，也可以是public，portected，private

2.构造器没有返回值

3.方法名 和类名必须一致

4.参数列表和成员方法规则一致

5.构造器的调用，由系统完成

```java
public class ss {
    public static void main(String[] args) {
        person p1 = new person("li", 60);
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
```