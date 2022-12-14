#### 1.idea快捷键

生成构造器快捷键command+n 、 查看继承关系ctrl+h、查找方法ctrl+b、.var自动次分配变量名new 类名+.var

#### 2.访问修饰符

    public 对外公开
    
    protected 对子类和同一个包公开
    
    private 只有类本身可以访问，不公开
    
    默认 向同一个包的类公开

#### 3.封装、继承、多态

##### 1.封装：

    A.将属性私有化
    B.提供一个公共的set方法用于对属性判断并赋值
    C.提供一个公共的get方法用于获取属性与值

##### 2.继承extend：

    A.把共有的属性放在A中在B类与C类中写特有的A类为父类或基类BC类为子类或派生类
    B.子类继承了所有属性与方法，但是私有的属性和方法不能在子类直接访问，要通过公共方法去访问
    C.创建子类对象父类无参构造器会被调用，如果父类无无参构造器则必须在子类构造器中用super去指定使用父
    类的那个构造器完成对父类的初始化否则编译不会通过，super必须放在构造器的第一行
    D.super与this仅仅只能存在一个
    E.Object是所有类的基类
    F.父类调用会直到Object类顶级父类
    H.java使用单继承，A-B B-C；
    I.继承从子到父开始访问
    J.super可以更好调用父类方法，如果父类没有便访问更上层父类，
    K.方法重写，方法名、参数与返回值必须相同然后父方法返回object那么子方法可以为属性其他都可以或object
    L.子类不能缩小父类访问例如：父方法为public那么子方法不能为private,如果父方法为private那么子方法
    可以为任何访问

#### 4.多态poly

    1）、多态方法的重写与重载体现多态
    2）、对象的多态
                A.一个对象的编译和运行类型可以不一致
                B.编译类型在定义对象时便确定了
                C.运行类型可以改变
                D.编译类型看定义时 = 号的左边，运行类型时看 =号右边
                E.不能访问子类全部方法例如A a=new B();B继承与A，需要遵循访问权限；向上转型
                F.B b=(B) a;向下转型；只能强转父类的引用，不能强转父类对象，要求父类引用指向当前目标类型的对象；可以调用子类类型中的所有成员,要现有向上转型才能有向下转型
                G.instanceof用于判断某变量是否为某类的子类或某类
    3）java的动态绑定机制:
                A.当调用对象方法时，该方法会和该对象的内存地址/运行类型绑定
                B.当调用对象属性时没有动态绑定机制，那里声明就在那里使用
    4）多态数组
                A.数组的定义类型为父类类型，里面实际保存元素为子类类型

```java
public class test {
    public static void main(String[] args) {
        Employee[] employee = new Employee[3];
        employee[0] = new Employee(1, "dsfs");
        employee[1] = new Worker(2, "dsfs");
        employee[2] = new Manage(3, "dsfs", 54646);
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] instanceof Worker) {
                System.out.println(employee[i].getAnnual());
            } else if (employee[i] instanceof Manage) {
                System.out.println(employee[i].getAnnual());
            } else {
                System.out.println(employee[i].getAnnual());
            }
        }
    }
}
```

#### 5.equals与==的对比

    ==判断对象是判断地址是否相等
    equals是判断基本数据类型值相等