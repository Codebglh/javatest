/**
 * @date:2022/10/4 23:26
 * @author: bgcode
 */
public class day3 {
    public static void main(String[] args) {
        int[][] i = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        MyTool a = new MyTool();
        a.map(i);
        int[] j = a.js(5, 2);
        System.out.println(j[1]);


    }
}

