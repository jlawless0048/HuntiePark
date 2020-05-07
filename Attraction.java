
/**
 * Base Kit for Attraction, with Profit-based Methods
 *
 * Hunter Stewart
 * 1.0
 */
public class Attraction
{
    private int maxRiders;
    private double ticketCost;
    private int usedTickets;
    private double utilCostPerRider;
    private double rideLength;
    private int rph;
    private double totalHours;
    
    public Attraction(){
        maxRiders = 20;
        ticketCost = 0.5;
        usedTickets = 5;
        utilCostPerRider = 2;
        rideLength = 0.25;
        rph = 100;
        totalHours = 12;
    }
    
    public int ridersPerRide(){
        double temp = rideLength * rph;
        if(maxRiders > temp){
            return ((int)temp);
        }
        else{
            return (maxRiders);
        }
    }
    
    public int numRidesPerDay(){
        return ((int)(totalHours / rideLength));
    }
    
    public double dailyCost(){
        double costPerRide = ridersPerRide() * utilCostPerRider;
        return (numRidesPerDay() * costPerRide);
    }
    
    public double ticketSales(){
        double salesPerRide = (double)usedTickets * (double)ridersPerRide();
        return (numRidesPerDay() * salesPerRide);
    }
    
    public double profit(){
        double gain = ticketSales() * ticketCost;
        double loss = dailyCost();
        return (gain - loss);
    }
}
