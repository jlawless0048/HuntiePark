public class getOutThread extends Thread{
    Park parky;

    public getOutThread(Park parkola){
        super();
        parky = parkola;
    }
    public void run(){
         while(Park.getTotalMoney() > 0 && Park.getAttendants() > 0){
             try {
                 sleep(1000);
             } catch (InterruptedException e) {
             }
             parky.goAway();
             parky.totalProfit();
         }
    }
}
