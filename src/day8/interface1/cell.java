package day8.interface1;

/**
 * @time : 2022/10/23 59
 * @author: bgcode
 */
public class cell implements Usb {
    @Override
    public void start() {
        System.out.println("Starting cell");
    }

    @Override
    public void stop() {
        System.out.println("Stopping cell");
    }
}
