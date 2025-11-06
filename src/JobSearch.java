public class JobSearch {
    public static void main(String[] args){
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        IObserver firstSubscriber = new Subscriber("Liam Johnson");
        IObserver secondSubscriber = new Subscriber("Sofia Martinez");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("First Java Position");
    }
}
