import java.util.List;

public class Subscriber implements IObserver{
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies){
        System.out.println("Dear "+ name);
        System.out.println("We have some changes in vacancies" +"\n"+vacancies);
    }

    public String getName() {
        return this.name;
    }
}
