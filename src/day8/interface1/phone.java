package day8.interface1;

/**
 * @time : 2022/10/22 13
 * @author: bgcode
 */
public class phone implements Usb {
    @Override
    public void stop() {
        System.out.println("Phone is stopped");
    }

    @Override
    public void start() {
        System.out.println("Starting...");
    }
}
