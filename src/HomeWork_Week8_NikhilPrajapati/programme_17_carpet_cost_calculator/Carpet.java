package HomeWork_Week8_NikhilPrajapati.programme_17_carpet_cost_calculator;

public class Carpet {
    double cost;
    public Carpet(double cost){
        if (cost < 0){
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
    public double getCost(){
        return cost;
    }
}
