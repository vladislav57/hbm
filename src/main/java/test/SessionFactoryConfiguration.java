package test;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class SessionFactoryConfiguration {

    @Autowired
    StandardServiceRegistry registry;

    @Bean(name = "SessionFactory")
    SessionFactory generateSessionFactory() {
        return new MetadataSources( registry ).buildMetadata().buildSessionFactory();
    }

}
