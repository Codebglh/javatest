#### 1.Final 可以修饰类、属性、方法、局部变量

    1）当不希望类被继承时可以用final修饰
    2）当不希望父类的某个方法被子类覆盖/重写可以用final修饰
    3）当不希望类的某个值被子类覆盖或重写
    4）当不希望某个局部变量被修改fianl int age=22;

#### 2

    1.fianl是定义定量常量用大写
    2.修饰属性可以在代码块中赋值、定义赋值、在构造器中赋值
    3.修饰static时不能在构造器中赋值
    4.fianl不能继承但可以实例化
    5.类不是fianl但含有final方法，该方法不能重写但可以继承