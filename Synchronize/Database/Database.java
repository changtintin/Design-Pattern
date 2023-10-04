package design_pattern.Synchronize.Database;

public class Database {
    public int []datasets;
    public Database(){
        datasets = new int[8];
    }

    public void setInfo(int baseNum){
        for(int i  =  0; i < 8; i++){
            datasets[i] = baseNum * i;            
            try {
                Thread.sleep(500);
                   
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            showData(i);            
        }
    }

    protected void showData(int idx){
        System.out.println(datasets[idx]);
    }
}
