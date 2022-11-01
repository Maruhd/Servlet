package patern.observer;

public class JobSerach {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancies("First java position ");
        jobSite.addVacancies("Second java position ");

        Observer firstSubscriber = new Subscriber("Pasha");
        Observer secondSubscriber = new Subscriber("Sasha");


        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

//        jobSite.addVacancies("Thierd java position");

        jobSite.removeVacancies("First java position");
    }

}
