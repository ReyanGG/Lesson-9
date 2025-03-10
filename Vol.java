class Shape {
    public double getVolume;return 0;
}

class cube extends Shape {
    private double h;
    private double b;

    public cube(double b) {
        this.b = b;
    }

    public double getVolume() {
        return b * b * b;
    }
}

class cuboid extends Shape {
    private double h;
    private double s;
    private double q;

    public cuboid(double s, double h, double q) {
        this.s = s;
        this.h = h;
        this.q = q;
    }

    public double getVolume() {
        return s * h * q;
    }
}

public class Vol {
    public static void main(String[]args){
        cuboid c = new cuboid();
        c.getVolume();

        cube d = new cube();
        d.getVolume();


}
}