package  weatherObserver.ObservePattern.SubjectPkg;
import weatherObserver.ObservePattern.ObserverPkg.Observer;

public interface Subject{
    public void registerObservers(Observer obr);
    public void removeObservers(Observer obr);
    public void notifyObservers(); 
}

