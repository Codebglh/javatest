/**
 * @date:2022/10/4 15:38
 * @author: bgcode
 */
//冒泡排序
public class day10 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 41, 5, 6, 7, 12, 55, 22665, 88, 51, 23, 21};
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}