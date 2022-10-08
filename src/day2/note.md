# 对象与类

#### 1.创建一个类

```java
class Cat {
    String name;
    int age;
    String color;
}//创建一个猫的类
```

#### 2.调用该类

```java
public class day1 {
    public static void main(String[] args) {
        Cat cat = new Cat();//创建一只猫的对象
        cat1.name = "John";//赋值
        cat1.age = 22;
        cat1.color = "blue";
        Cat cat2 = new Cat();
        cat2.name = "Tom";
        cat2.age = 23;
        cat2.color = "red";
    }
}
//https://cdn.jsdelivr.net/gh/Codebglh/java/img/image-20221004220011506.png图片路径
```

#### 3.类在内存中的布局

![流程图](https://cdn.jsdelivr.net/gh/Codebglh/java/img/image-20221004220011506.png)

#### 4.打印类

```java
public class day1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "John";
        cat1.age = 22;
        cat1.color = "blue";
        Cat cat2 = new Cat();
        cat2.name = "Tom";
        cat2.age = 23;
        cat2.color = "red";
        System.out.print(cat1.name + "\t" + cat1.age + "\t" + cat2.color);
    }
}

class Cat {
    String name;
    int age;
    String color;
}
```

#### 5.类内存分配与数组类似

```java
public class day1 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "John";
        cat1.age = 22;
        cat1.color = "blue";
//        Cat ss = new Cat();
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
}//输出为green说明他们指定内存地址一样
```

#### 6.方法使用

```java
public class day2 {
    public static void main(String[] args) {
        Person person = new Person();//创建一个对象
        person.speak();//调用方法speak
        int i = person.ca1(20);//调用方法ca1
        System.out.println(i);//接收并打印i
    }
}

class Person {
    String name;
    int age;

    public void speak() {
        System.out.print("我是一个好人");//这是一个方法public公开/protected/private私有/默认总共四种的、void无返回值、speak方法名、{}方法体
    }

    public int ca1(int n) {//第一个int指返回数据类型、第二个int指输入数据类型
        n += 20;
        return n;//返回数据
    }
}
```

#### 7.方法调用机制

```java
public class day3 {
    public static void main(String[] args) {
        int[][] i = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
//        MyTool a = new MyTool();
//        a.map(i);


    }
}

//class MyTool {
//    public void map(int[][] xt) {
//        for (int i = 0; i < xt.length; i++) {
//            for (int j = 0; j < xt[i].length; j++) {
//                System.out.print(xt[i][j]);
//            }
//        }
//    }
//}//调用方法快速开发
```

#### 8.方法简介

```java
//1.一个方法最多只有一个返回值如果有多个值返回可以用数组
//2.返回类型可以为任何类型；对象数组值等等
//3.如方法要求要有返回值则必须有return且返回值与定义值一样或者兼容
//4.可以为空或者多个用”,“隔开，调用参数要用一致或者兼容的参数
//5.同一个类的方法可以直接调用，跨类方法要通过对象名来调用先创建对象在调用例如：类名 对象名 = new 类名()；对象名.方法();
//例如：
public class day3 {
    public static void main(String[] args) {
        MyTool a = new MyTool();
        int[] j = a.js(5, 2);
        System.out.println(j[1]);
    }
}

class MyTool {
    public int[] js(int a, int b) {
        int[] xt = new int[2];
        xt[0] = a + b;
        xt[1] = a - b;
        return xt;
    }
}
```

#### 9.递归在方法体内调用自己例如：

```java
public class test {
    public static void main(String[] args) {
        MyTool a = new MyTool();
        int j = a.jc(5);
        int h = a.sds(5);
        System.out.print(j);

    }
}

class MyTool {
    public int sds(int a) {

        if (a < 20) {
            return sds(a + 1);
        } else {
            return a;
        }

    }

    public int jc(int a) {
        if (a == 1) {
            return 1;
        } else {
            return jc(a - 1) * a;
        }
    }//阶乘
}//打印是从最里层开始例如
//1.执行一个条件时，就创建一个栈空间独立的
//2.方法的局部变量是独立的，不会相互影响
//3.如果引用的是类型变量如数组，对象，就会共享该引用的类型数据
//4.递归需要向退出递归方向靠近不然会导致无限循环出错
//5.当一个方法执行完谁调用就返回给谁
```