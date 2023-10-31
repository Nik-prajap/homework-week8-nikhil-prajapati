package HomeWork_Week8_NikhilPrajapati.programme_20_pool_area;

public class Main {

    public static void main(String[] args) {


        Rectangle r1 = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + r1.getWidth());
        System.out.println("rectangle length= " + r1.getLength());
        System.out.println("rectangle area= " + r1.getArea());

        Cuboid c2 = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + c2.getWidth());
        System.out.println("cuboid.length= " + c2.getLength());
        System.out.println("cuboid.area= " + c2.getArea());
        System.out.println("cuboid.height= " + c2.getHeight());
        System.out.println("cuboid.volume= " + c2.getVolume());
    }
}
