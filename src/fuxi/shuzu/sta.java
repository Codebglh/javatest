package fuxi.shuzu;

/**
 * @time : 2022/10/30 41
 * @author: bgcode
 */
public class sta {
 
    public static void main(String[] args) {
        Car car1 = new Car(30);
        car1.getAir().flow();

    }
}

class Car {
    private double temperature;

    class Air {
        public void flow() {
            if (temperature < 0) {
                System.out.println("吹热风");
            } else if (temperature > 40) {
                System.out.println("吹冷风");
            } else {
                System.out.println("关闭空调");
            }
        }
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public Air getAir() {
        return new Air();
    }
}