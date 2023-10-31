package HomeWork_Week8_NikhilPrajapati.programme_20_pool_area;

public class Cuboid  extends Rectangle {

    double height;

    // constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;

    }
}
