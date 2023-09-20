package  ObservePattern.SubjectPkg;
import ObservePattern.ObserverPkg.Observer;

public interface Subject{
    public void registerObservers(Observer obr);
    public void removeObservers(Observer obr);
    public void notifyObservers(); 
}

