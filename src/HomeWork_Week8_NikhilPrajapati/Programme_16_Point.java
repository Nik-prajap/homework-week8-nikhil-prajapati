package HomeWork_Week8_NikhilPrajapati;

public class Programme_16_Point {

    // Variable declaration
    private int x;
    private int y;

    // First constructor (no-arguments constructor)
    public Programme_16_Point() {
        this(0, 0); // Calls the second constructor to initialize with default values (0, 0)
    }

    // Second constructor with parameters x and y
    public Programme_16_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // X Getter
    public int getX() {
        return x;
    }

    // Y Getter
    public int getY() {
        return y;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Calculate distance to Point (0,0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // Calculate distance to Point (x, y)
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Calculate distance to another Point
    public double distance(Programme_16_Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }

    // Main method
    public static void main(String[] args) {
        Programme_16_Point first = new Programme_16_Point(6, 5);
        Programme_16_Point second = new Programme_16_Point(3, 1);
        System.out.println("distance(0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2, 2));
        Programme_16_Point point = new Programme_16_Point();
        System.out.println("distance() = " + point.distance());
    }
}
