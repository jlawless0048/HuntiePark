public class TowerOfTerror extends Attraction{
    private double scaresPerMinute;
    private static double scareCoefficient = 0;

    public TowerOfTerror() {
        super();
        scaresPerMinute = 0;
    }

    public static double getScareCoefficient(){
        return scareCoefficient;
    }

    public static void upgradeScare(){
        Park.getUpgrade();
        scareCoefficient++;
    }

    public void calculateScares(){
        double temp = ((double)((int)(Math.random() * 10))) - 5 + scareCoefficient;
        if(temp < 0){
            temp = 0;
        }
        scaresPerMinute = temp;
    }

    public double profit(){
        calculateScares();
        double gain = ticketSales() * Park.getTicketCost() * scaresPerMinute;
        double loss = dailyCost();
        return (gain - loss);
    }
}
