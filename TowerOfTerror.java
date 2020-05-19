public class TowerOfTerror extends Attraction{
    private double scaresPerMinute;
    private double scareCoefficient;

    public TowerOfTerror() {
        super();
        scaresPerMinute = 1;
        scareCoefficient = 0;
    }
    public TowerOfTerror(int mR, int uT, double rL, int r, double s, int spm, double sC) {
        super(mR, uT, rL, r, s);
        scaresPerMinute = spm;
        scareCoefficient = sC;
    }

    public void addScare() {
        scareCoefficient++;
    }

    public void calculateScares(){
        scaresPerMinute =  ((double)((int)(Math.random() * 10))) - 5 + scareCoefficient;
    }

    public double profit(){
        calculateScares();
        double gain = ticketSales() * Park.getTicketCost() * scaresPerMinute;
        double loss = dailyCost();
        return (gain - loss);
    }
}
