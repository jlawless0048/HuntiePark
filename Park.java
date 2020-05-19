import java.util.ArrayList;

public class Park {
    private ArrayList<Attraction> AmmusementPark;

    private static double ticketCost = 0.25;
    private static int attendants = 3000;
    private static double totalHours = 12;
    private static double totalMoney = 1000;

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

    public void addCoaster(){
        AmmusementPark.add(new RollerCoaster());
    }

    public void addTower(){
        AmmusementPark.add(new TowerOfTerror());
    }

    public double totalProfit(){
        double total = 0;
        for(Attraction ride : AmmusementPark){
            total += ride.profit();
        }
        return total;
    }

    public void goAway(){
        attendants -= 5;
    }

    public void comeBack(){
        attendants += 2;
    }
}
