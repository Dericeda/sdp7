import java.util.List;
import java.util.ArrayList;

public class JavaDeveloperJobSite implements IObserved{
    private List<String> vacancies = new ArrayList<>();
    private List<IObserver> subscribers = new ArrayList<>();

    public void addVacancy(String vacancy){
         this.vacancies.add(vacancy);
         notifyObservers();
    };

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer){
        this.subscribers.add(observer);
    };

    @Override
    public void removeObserver(IObserver observer){
        this.subscribers.remove(observer);
    };

    @Override
    public void notifyObservers(){
        for(IObserver observer: subscribers){
            observer.handleEvent(this.vacancies);
        }
    };

    public List<String> getVacancies() {
        return this.vacancies;
    }

    public List<IObserver> getSubscribers() {
        return this.subscribers;
    }


}
