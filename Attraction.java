/**
 * Base Kit for Attraction, with Profit-based Methods
 * Hunter Stewart
 * 1.0
 */
public class Attraction
{
    private int maxRiders;
    private int usedTickets;
    private double rideLength;
    private int rph;
    private double speed;
    
    public Attraction(){
        maxRiders = 10;
        usedTickets = 5;
        rideLength = 0.25;
        rph = 100;
        speed = 5;
    }
    public Attraction(int mR, int uT, double rL, int r, double s){
        maxRiders = mR;
        usedTickets = uT;
        rideLength = rL;
        rph = r;
        speed = s;
    }
    
    public void setMaxRiders(int num){
        maxRiders = num;
    }
    public void setUsedTickets(int num){
        usedTickets = num;
    }
    public void setRideLength(double num){
        rideLength = num;
    }
    public void setRPH(int num){
        rph = num;
    }
    public void setSpeed(double num){
        speed = num;
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
        return ((int)(Park.getTotalHours()/ rideLength));
    }
    
    public double utilCostPerRider(){
        return ((speed * rideLength * 10) / ridersPerRide());
    }
    
    public double dailyCost(){
        double costPerRide = ridersPerRide() * utilCostPerRider();
        return (numRidesPerDay() * costPerRide);
    }
    
    public double ticketSales(){
        double salesPerRide = (double)usedTickets * (double)ridersPerRide();
        return (numRidesPerDay() * salesPerRide);
    }
    
    public double profit(){
        double gain = ticketSales() * Park.getTicketCost();
        double loss = dailyCost();
        return (gain - loss);
    }
}
