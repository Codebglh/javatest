public class day4 {
    public static void main(String[] args) {
        MyTool ss = new MyTool();
        if (ss.dis(4)) {
            System.out.println("奇数");
        } else {
            System.out.println("偶数");
        }
        ss.print(20, 20, '#');
    }
}
