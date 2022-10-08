/**
 * @date:2022/10/5 21:45
 * @author: bgcode
 */
public class MyTool {
    public int sds(int a) {

        if (a < 20) {
            return sds(a += 1);
        } else {
//            System.out.print(a + "\t");
            return a;
        }

    }

    public int jc(int a) {
        if (a == 1) {
            return 1;
        } else {
            return jc(a - 1) * a;
        }
    }

    public int fb(int a) {
        if (a > 0) {
            if (a == 1 || a == 2) {
                return 1;
            } else {
                return fb(a - 1) + fb(a - 2);
            }
        } else {
            System.out.print("你的输入有误");
            return -1;

        }
    }

    public void map(int[][] xt) {
        for (int i = 0; i < xt.length; i++) {
            for (int j = 0; j < xt[i].length; j++) {
                System.out.print(xt[i][j]);
            }
        }
    }

    public int[] js(int a, int b) {
        int[] xt = new int[2];
        xt[0] = a + b;
        xt[1] = a - b;
        return xt;
    }

    public boolean dis(int a) {
        return a % 2 != 0;
    }

    public void print(int a, int b, char s) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    String name;
    int age;

    public MyTool change(MyTool a) {
        MyTool c = new MyTool();
        c.name = a.name;
        c.age = a.age;

        return c;
    }


    public void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
        }
    }

    public int hz(int a) {
        if (a == 10) {
            return 1;
        } else if (a >= 1 || a <= 9) {
            return (hz(a + 1) + 1) * 2;
        } else {
            System.out.print("day在范围外");
            return -1;
        }//猴子吃桃子
    }



}