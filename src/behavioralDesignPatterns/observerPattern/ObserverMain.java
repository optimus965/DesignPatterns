package behavioralDesignPatterns.observerPattern;

public class ObserverMain {
    public static void main(String[] args) {

        // each one observer will implement one interface which is required
        // with the help of that we can register one observer or add observer
        // if there is any new data comes we will call that update method using for loop because of polymorphism

        FitnessData fitnessData = new FitnessData();
        LiveActivityDisplay display = new LiveActivityDisplay();
        ProgressLogger logger = new ProgressLogger();
        GoalNotifier notifier = new GoalNotifier();

        // Register observers
        fitnessData.registerObserver(display);
        fitnessData.registerObserver(logger);
        fitnessData.registerObserver(notifier);

        // Simulate updates
        fitnessData.newFitnessDataPushed(500, 5, 20);
        fitnessData.newFitnessDataPushed(9800, 85, 350);
        fitnessData.newFitnessDataPushed(10100, 90, 380); // Goal should trigger

        // Daily reset
        notifier.reset();
        fitnessData.dailyReset();
}
}
