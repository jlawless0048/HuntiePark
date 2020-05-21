import java.util.ArrayList;

public class Park {
    private ArrayList<Attraction> AmmusementPark;

    private static double ticketCost = 0.25;
    private static int attendants = 3000;
    private static double totalHours = 12;
    private static double totalMoney = 1000;
    private static int adLevel = 5;
    private static int numCoaster = 0;
    private static int numTower = 0;

    public Park(){
        AmmusementPark = new ArrayList<Attraction>();
    }

    public static double getTicketCost(){
        return ticketCost;
    }
    public static int getAttendants(){
        return attendants;
    }
    public static double getTotalHours() {
        return totalHours;
    }
    public static double getTotalMoney(){
        return totalMoney;
    }
    public static int getNumCoaster(){
        return numCoaster;
    }
    public static int getNumTower(){
        return numTower;
    }
    public static int getAdLevel(){
        return adLevel;
    }

    public void addCoaster(){
        totalMoney -= 500;
        numCoaster++;
        AmmusementPark.add(new RollerCoaster());
    }

    public void addTower() {
        totalMoney -= 750;
        numTower++;
        AmmusementPark.add(new TowerOfTerror());
    }

    public static void getUpgrade(){
        totalMoney -= 1000;
    }

    public void increaseAdLevel() {
        totalMoney -= 100;
        adLevel += 5;
    }

    public void totalProfit(){
        double total = 0;
        for(Attraction ride : AmmusementPark){
            total += ride.profit();
        }
        totalMoney += total;
    }

    public void goAway(){
        attendants -= 5;
    }

    public void comeBack(){
        attendants += adLevel;
    }

    public static void rideTime(){
        attendants --;
    }
}
