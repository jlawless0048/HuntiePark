public class RollerCoaster extends Attraction
{
    private double vomitCoefficient;

    public RollerCoaster() {
        super();
        vomitCoefficient = 1;
    }

    public RollerCoaster(int mR, int uT, double rL, int r, double s, double vC){
        super(mR, uT, rL, r, s);
        vomitCoefficient = vC;
    }

    public void addVomit(){
        vomitCoefficient += 0.1;
    }

    public double profit(){
        double gain = ticketSales() * ticketCost * vomitCoefficient;
        double loss = dailyCost();
        return (gain - loss);
    }
}
