package test;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

@Repository
public class EventDAOImpl implements EventDAO {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void addEvent(Event event) {
        sessionFactory.getCurrentSession().saveOrUpdate(event);
    }

    @Override
    public Event getEvent(Long id) {
        return sessionFactory.getCurrentSession().get(Event.class, id);
    }
}
