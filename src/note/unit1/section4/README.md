@time  : 2022/11/23 23

@author: bgcode

1、一维数组[]创建int[] 数组名=new 数据类型[长度];

2、二维数组[] []创建int[] [] 数组名=new 数据类型[长度] [长度]

3、赋值用{}进行赋值

4、冒泡排序

```java
public class shuzu{
  public static void main(String[] args){
    int s[]={1,22,2,32,21,4,9,4};
    for(int i=1;i<s.length;i++){
      for(int j=0;i<s.length;j++){
        if(s[i]<s[j]){
          int a=s[i];
          s[i]=s[j];
          s[j]=a;
        }
      }
    }
    for(int i=0;i<s.length;i++){
      System.out.print(s[i]+"\t")
    }
  }
}
```

5、方法声明及使用

6、方法重载及在函数()中改变输入数据类型用return结束一个方法

7、递归及函数的自调用一直连续调用

8、foreach输出

```java
for(int x:arg){
  System.out.print(x);
}
```

