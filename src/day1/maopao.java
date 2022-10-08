package day1;

/**
 * @time : 2022/10/8 37
 * @author: bgcode
 */
public class maopao {
    public static void main(String[] args) {
        int max;
        int[] arr = {1, 2, 3, 41, 5, 6, 7, 12, 55, 22665, 88, 51, 23, 21};
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
