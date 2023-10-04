package design_pattern.Synchronize.User;
import design_pattern.Synchronize.Database.Database;

public class Company extends Thread{
    public Database db;
    public Company(Database db){
        this.db = db;
    }
    public void getDataset(int n){
        db.setInfo(n);
    }
}
