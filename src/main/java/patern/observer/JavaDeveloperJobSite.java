package patern.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed{
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscriber = new ArrayList<>();

    public void addVacancies (String vacancies){
        this.vacancies.add(vacancies);
        notifyObserved();
    }

    public void removeVacancies(String vacansies){
        this.vacancies.remove(vacansies);
        notifyObserved();
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscriber.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscriber.remove(observer);
    }

    @Override
    public void notifyObserved() {
        for (Observer observer: subscriber) {
            observer.handleEvent(this.vacancies);
            
        }
    }
}
