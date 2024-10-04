package exit;

import exe.MyList;

public class EventManager {
    private MyList<EventListeners> listeners;

    public EventManager(MyList<EventListeners> listeners) {
        this.listeners = listeners;
    }

    public MyList<EventListeners> getListeners() {
        return listeners;
    }

    public void setListeners(MyList<EventListeners> listeners) {
        this.listeners = listeners;
    }
    public void subscribe(EventListeners listen)
    {
        listeners.add(listen);
    }
    public void unsubscribe(EventListeners listen)
    {
        listeners.remove(listen);
    }

    public void notifyAdd(String event)
    {
        //listeners.forEach(listeners -> listeners.update(event));
    }
}
