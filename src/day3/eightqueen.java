package day3;

/**
 * @time : 2022/10/8 45
 * @author: bgcode
 */
public class eightqueen {
    int[] arr = new int[8];

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean judge(int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[n] || Math.abs(n - i) == Math.abs(arr[n] - arr[i])) {
                return false;
            }

        }
        return true;
    }


    public void put(int n) {
        if (n == 8) {
            print();
            return;
        }
        for (int i = 0; i < 8; i++) {
            arr[n] = i;
            if (judge(n)) {
                put(n + 1);
            }
        }
    }


}

class arr {
    public static void main(String[] args) {
        eightqueen m = new eightqueen();
        m.put(0);
    }
}