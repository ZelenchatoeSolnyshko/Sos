package exit;


public class LoggingListeners implements EventListeners {
    @Override
    public void update(String event) {
            System.out.println("Write to log" + event);
    }
}
