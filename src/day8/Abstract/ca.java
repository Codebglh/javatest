package day8.Abstract;

/**
 * @time : 2022/10/22 40
 * @author: bgcode
 */
abstract public class ca {
    public abstract void job();

    public void calculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("Calculating time for " + (end - start));
    }
}
