package day9.enum1;

/**
 * @time : 2022/10/30 43
 * @author: bgcode
 */
public class enum1 {
    public static void main(String[] args) {
        ss[] sss = ss.values();
        for (ss ss : sss) {
            System.out.println(ss.toString());
        }
    }
}


@SuppressWarnings("unused")
enum ss {
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private final String date;

    ss(String date) {
        this.date = date;

    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return
                date;
    }
}