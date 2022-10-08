package day1;

/**
 * @time : 2022/10/8 31
 * @author: bgcode
 */
public class shuzutihuan {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 3, 4, 5, 6}, {1, 2, 3, 4, 5, 6}};//二维数组
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//        int[][] yh = new int[10][];
//        for (int i = 0; i < 10; i++) {
//            yh[i] = new int[i + 1];
//            for (int j = 0; j < yh[i].length; j++) {
//                if (j == 0 || j == yh[i].length - 1) {
//                    yh[i][j] = 1;
//                } else {
//                    yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1];
//                }
//            }
//        }
//        for (int i = 0; i < yh.length; i++) {
//            for (int j = 0; j < yh[i].length; j++) {
//                System.out.print(yh[i][j] + "\t");
//            }
//            System.out.println();
//        }
        int[] yh = new int[10];
        for (int i = 0; i < 10; i++) {
            yh[i] = (int) (Math.random() * 100) + 1;
        }
        int a = 26;
        int index = 0;
        int max = 0;
        for (int i = 0; i < yh.length - 1; i++) {
            for (int j = 0; j < yh.length - 1 - i; j++) {
                if (yh[j] > yh[j + 1]) {
                    max = yh[j];
                    yh[j] = yh[j + 1];
                    yh[j + 1] = max;

                }
            }
        }//排序从小到大
        for (int i = 0; i < yh.length; i++) {
            if (yh[i] >= a) {
                index = i;
                break;
            }
        }
        int[] v = new int[yh.length + 1];
        for (int i = 0, j = 0; i < v.length; i++) {

            if (i != index) {
                v[i] = yh[j];
                j++;
            } else {
                v[i] = a;
            }
        }
        yh = v;
        for (int i = 0; i < yh.length; i++) {
            System.out.print(yh[i] + "\t");
        }
    }

}
