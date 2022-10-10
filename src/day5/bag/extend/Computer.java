package day5.bag.extend;

/**
 * @time : 2022/10/10 38
 * @author: bgcode
 */
public class Computer {
    private final String cpu;
    private final String memory;
    private final String disk;

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    public String info() {

        return "电脑cpu为：" + cpu + "内存为：" + memory + "硬盘为：" + disk;
    }
}

class PC extends Computer {
    public PC(String cpu, String memory, String disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    String brand;

    public String getDetails() {
        System.out.println(info() + "品牌为：" + brand);
        return info() + "品牌为：" + brand;
    }

}

class NotePad extends Computer {
    String color;

    public NotePad(String cpu, String memory, String disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public String getDetails() {
        System.out.println(info() + "颜色为：" + color);
        return info() + "颜色为：" + color;
    }
}

class Test {
    public static void main(String[] args) {
        NotePad notePad = new NotePad("i7-9700k", "16G", "250G", "红色");
        PC pc = new PC("i5-12000k", "32G", "1T", "华为");
        pc.getDetails();
        notePad.getDetails();
    }
}