package day5.bag.poly;

/**
 * @time : 2022/10/10 22
 * @author: bgcode
 */
public class poly {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Cat cat2 = (Cat) cat;
        cat2.catchMouse();
    }
}
