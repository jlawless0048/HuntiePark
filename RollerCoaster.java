public class RollerCoaster extends Attraction
{
    private static double vomitCoefficient = 1;

    public static void addVomit(){
        Park.getUpgrade();
        vomitCoefficient += 0.1;
    }

    public static double getVomitCoefficient(){
        return vomitCoefficient;
    }

    public double profit(){
        double gain = ticketSales() * Park.getTicketCost() * vomitCoefficient;
        double loss = dailyCost();
        return (gain - loss);
    }
}
