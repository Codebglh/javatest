package day3;

/**
 * @time : 2022/10/8 33
 * @author: bgcode
 */
public class migong {
    public static void main(String[] args) {
        Cat m = new Cat();

        int[][] a = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                a[i][j] = 0;
            }
        }
        for (int i = 0; i < 8; i++) {
            a[0][i] = 1;
            a[7][i] = 1;
            a[i][0] = 1;
            a[i][7] = 1;
        }
        a[3][1] = 1;
        a[3][2] = 1;
        m.findway(a, 1, 1);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Cat {
    public boolean findway(int[][] a, int i, int j) {
        if (a[6][6] == 2) {
            return true;
        } else {
            if (a[i][j] == 0) {
                a[i][j] = 2;
                if (findway(a, i + 1, j)) {
                    return true;
                } else if (findway(a, i, j + 1)) {
                    return true;
                } else if (findway(a, i - 1, j)) {
                    return true;
                } else if (findway(a, i, j - 1)) {
                    return true;
                } else {
                    a[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }
//迷宫寻路
}