package day3;

/**
 * @time : 2022/10/8 34
 * @author: bgcode
 */
public class bahuangh {
    int[] a = new int[9];
    int c = 1;

    public boolean judge(int n) {
        for (int i = 1; i < n; i++) {

            if (a[n] == a[i] || Math.abs(n - i) == Math.abs(a[n] - a[i])) {
                return false;
            }
        }
        return true;
    }

    public void print(int[] a, int c) {
        System.out.print("第" + c + "次");
        for (int i = 1; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void put(int b) {

        if (b == 9) {
            print(a, c);
            c++;
            return;
        }
        for (int i = 1; i < 9; i++) {
            a[b] = i;
            if (judge(a[b])) {
                put(b + 1);


            }

        }
    }
}

class Test {
    public static void main(String[] args) {
        bahuangh cc = new bahuangh();
        cc.put(1);
    }

}