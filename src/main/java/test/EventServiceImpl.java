package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EventServiceImpl implements EventSerive{

    @Autowired
    private EventDAO eventDAO;

    @Override
    @Transactional
    public void addEvent(Event event) {
        eventDAO.addEvent(event);
    }

    @Override
    @Transactional
    public Event getEvent(Long id) {
        return eventDAO.getEvent(id);
    }
}
