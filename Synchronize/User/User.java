package design_pattern.Synchronize.User;
import design_pattern.Synchronize.Database.Database;

public abstract class User {
    public Database db;
    protected int baseNum;
   
    abstract public void getDataset(int n);
}
