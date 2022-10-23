package day8.Abstract;

/**
 * @time : 2022/10/22 10
 * @author: bgcode
 */
public class a extends ca {
    @Override
    public void job() {
        int i = 2;
        for (int j = 2; j < 100000; j++) {
            i *= j;
        }
    }
}
