package test;

public interface EventDAO {

    public void addEvent(Event event);

    public Event getEvent(Long id);
}
