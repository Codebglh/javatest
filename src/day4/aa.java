package day4;

/**
 * @time : 2022/10/9 28
 * @author: bgcode
 */
public class aa {
    public static void main(String[] args) {
        double[] a = {};
        String[] e = {"sadaaaa", "sadaa", "sassd", "sasd", "sada", "ss"};
        int[] sa = {1, 2, 3, 4, 5, 6, 7, 8};
        A01 b = new A01();
        A02 c = new A02();
        A03 d = new A03();
        System.out.print(b.max(a) + " ");
        System.out.print(c.find(e, "ss") + " ");
        Book b2 = new Book("ssss", 180);
        System.out.print(b2.updatePrice(b2.price));
        int[] b12 = d.copyArr(sa);
        System.out.print(sa.hashCode() + "\t");
        System.out.print(b12.hashCode());
        d.print(sa);
        d.print(b12);
        Circle r = new Circle(2);
        r.print(r.r);
        Cale cale = new Cale(1, 0);
        Double sdsd = cale.calculate3(cale.a, cale.b);
        if (sdsd == null) {
            System.out.print("除数为0");
        } else {
            System.out.print(sdsd);
        }
    }
}

class A01 {
    public Double max(double[] a) {

        if (a != null && a.length > 0) {
            double b = a[0];
            for (int i = 1; i < a.length; i++) {
                if (b < a[i]) {
                    b = a[i];
                }
            }
            return b;
        } else {
            return null;
        }
    }//利用Double返回类
}

class A02 {
    public int find(String[] a, String b) {

        for (int i = 0; i < a.length; i++) {
            if (b.equals(a[i])) {

                return i;
            }
        }
        return -1;
    }
}

class Book {
    int price;
    String book;

    public int updatePrice(int c) {
        if (c > 150) {
            return this.price = 150;

        } else if (c > 100) {
            return this.price = 100;
        } else {
            return this.price = c;
        }
    }

    public Book(String book, int price) {
        this.price = price;
        this.book = book;
    }
}

class A03 {
    public int[] copyArr(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        return b;
    }

    public void print(int[] b) {
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double C(double r) {
        return this.r * 3.14 * 2;
    }

    public double S(double r) {
        return this.r * 3.14 * this.r;
    }

    public void print(double r) {
        System.out.print("半径" + r + "周长" + this.C(r) + "面积" + this.S(r));
    }
}

class Cale {
    double a;
    double b;

    public Cale(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculate1(double a, double b) {
        return this.a + this.b;
    }

    public double calculate2(double a, double b) {
        return this.a * this.b;
    }

    public Double calculate3(double a, double b) {
        if (this.b == 0) {
            return null;
        } else {
            double c = this.a / this.b;
            return c;
        }
    }

    public double calculate4(double a, double b) {
        return this.a - this.b;
    }
}