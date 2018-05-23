package test;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SessionFactoryConfiguration {

    @Autowired
    StandardServiceRegistry registry;

    @Bean(name = "SessionFactory")
    SessionFactory generateSessionFactory() {
        return new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    }

}
