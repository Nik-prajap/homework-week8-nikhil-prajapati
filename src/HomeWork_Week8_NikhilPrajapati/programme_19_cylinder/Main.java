package HomeWork_Week8_NikhilPrajapati.programme_19_cylinder;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(3.75);
        System.out.println("circle.radius= " + c1.getRadius());
        System.out.println("circle.area= " + c1.getArea());

        Cylinder c2 = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + c2.getRadius());
        System.out.println("cylinder.height= " + c2.getHeight());
        System.out.println("cylinder.area= " + c2.getArea());
        System.out.println("cylinder.volume= " + c2.getVolume());
    }

}
