/**
 * @date:2022/10/5 16:02
 * @author: bgcode
 */

public class day5 {
    public static void main(String[] args) {
        int[][] day1 = new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        MyTool a = new MyTool();
//        a.print(day1);
        a.age = 11;
        a.name = "ss";
        MyTool c = a.change(a);
        c.age = 12;
        System.out.println(a.age);
        System.out.println(c.age);

    }
}

