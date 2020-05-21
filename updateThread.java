import javax.swing.*;

public class updateThread extends Thread{
    JTable table;

    public updateThread(JTable tabley){
        super();
        table = tabley;
    }
    public void run(){
         while(Park.getTotalMoney() > 0 && Park.getAttendants() > 0){
             try {
                 sleep(100);
             } catch (InterruptedException e) {
             }
             table.setValueAt("$" + Park.getTotalMoney(),0,1);
             table.setValueAt(Park.getAttendants(), 1, 1);
             table.setValueAt(Attraction.getUsedTickets(), 2, 1);
             table.setValueAt(Attraction.getEnergyEfficiency(), 3, 1);
             table.setValueAt(Attraction.getMaxRiders(), 4, 1);
             table.setValueAt(RollerCoaster.getVomitCoefficient(), 5, 1);
             table.setValueAt(TowerOfTerror.getScareCoefficient(), 6, 1);
             table.setValueAt(Park.getNumCoaster(), 7, 1);
             table.setValueAt(Park.getNumTower(), 8, 1);
             table.setValueAt(Park.getAdLevel(), 9, 1);
         }
    }
}
