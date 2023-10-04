package design_pattern.Synchronize;

import design_pattern.Synchronize.Database.Database;
import design_pattern.Synchronize.User.*;


public class Synchronize {
    public static void main(String[] args) {
        Database db = new Database();
        School highschool = new School(db);        
        Company NikeCo = new Company(db);
        Company AdidasCo = new Company(db);

        highschool.getDataset(8);
        NikeCo.getDataset(10);
        AdidasCo.getDataset(3);
    }
}
