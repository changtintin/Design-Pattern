package design_pattern.Synchronize.User;

import design_pattern.Synchronize.Database.Database;

public class School extends Thread{
    public Database db;
    public School(Database db){
        this.db = db;
    }
    public void getDataset(int n){
        db.setInfo(n);
    }
}
