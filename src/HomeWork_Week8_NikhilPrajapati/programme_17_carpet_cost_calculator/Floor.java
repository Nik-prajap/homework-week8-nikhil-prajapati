package HomeWork_Week8_NikhilPrajapati.programme_17_carpet_cost_calculator;

public class Floor {
    double width;
    double length;

    // constructor
    public Floor(double width, double length){
        if (width < 0){
            this.width  = 0;
        } else {
            this.width = width;
        }
        if (length < 0){
            this.length = 0;
        } else {
            this.length = length;
        }

    }
    public double getArea(){
        return width * length;
    }
}
