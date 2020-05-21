/**
 * Base Kit for Attraction, with Profit-based Methods
 * Hunter Stewart
 * 1.0
 */
public class Attraction
{
    private static int maxRiders = 10;
    private static int usedTickets = 5;
    private static double rideLength = 0.25;
    private static double energyEfficiency = 0;
    
    public static void setMaxRiders(int num){
        maxRiders = num;
    }
    public void setUsedTickets(int num){
        usedTickets = num;
    }
    public void setRideLength(double num){
        rideLength = num;
    }
    public static void setEnergyEfficiency(double num){
        energyEfficiency = num;
    }

    public static int getMaxRiders(){
        return maxRiders;
    }

    public static double getEnergyEfficiency(){
        return energyEfficiency;
    }

    public static int getUsedTickets(){
        return usedTickets;
    }

    public static void upMax(){
        Park.getUpgrade();
        maxRiders++;
    }

    public static void upEfficiency(){
        Park.getUpgrade();
        energyEfficiency++;
    }

    public static void upTicket(){
        Park.getUpgrade();
        usedTickets++;
    }
    
    public int ridersPerRide(){
        int riders = 0;
        while(riders < maxRiders && Park.getAttendants() > 0){
            Park.rideTime();
            riders++;
        }
        return riders;
    }
    
    public double utilCostPerRider(){
        if(ridersPerRide() > 0) {
            return (((10 - energyEfficiency) * rideLength) / ridersPerRide());
        }
        return 0;
    }
    
    public double dailyCost(){
        double costPerRide = (double)ridersPerRide() * utilCostPerRider();
        return (costPerRide);
    }
    
    public double ticketSales(){
        double salesPerRide = (double)usedTickets * (double)ridersPerRide();
        return (salesPerRide);
    }
    
    public double profit(){
        double gain = ticketSales() * Park.getTicketCost();
        double loss = dailyCost();
        return (gain - loss);
    }
}
