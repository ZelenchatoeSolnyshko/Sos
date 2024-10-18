package exit;

public class EmailAlertsListeners implements EventListeners {
    @Override
    public void update(String event) {
        System.out.println("Send to email" + event);
    }
}
