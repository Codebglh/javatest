/**
 * @time : 2022/10/6 56
 * @author: bgcode
 */
public class MyTool {
    public boolean findway(int[][] a, int i, int j) {
        if (a[6][5] == 2) {
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
}
