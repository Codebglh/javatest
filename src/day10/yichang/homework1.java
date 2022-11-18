package day10.yichang;

/**
 * @time : 2022/11/2 14
 * @author: bgcode
 */
public class homework1 {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            double res = chu2(n1, n2);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("参数格式不对需要输出整数");
        } catch (ArithmeticException e) {
            System.out.println("出现除数为0的情况");
        }
    }

    public static int chu2(int n1, int n2) {
        return n1 / n2;

    }
}

