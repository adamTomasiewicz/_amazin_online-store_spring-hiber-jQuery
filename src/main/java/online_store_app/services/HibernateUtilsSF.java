package online_store_app.services;

import online_store_app.auth.Users;
import online_store_app.model.WebFile;
import online_store_app.model.BoardGame;
import online_store_app.model.Book;
import online_store_app.model.VideoGame;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
public class HibernateUtilsSF {
    private final SessionFactory sessionFactory;

    public HibernateUtilsSF () {
        this.sessionFactory=setSessionFactory();
    }

    public SessionFactory getSessionFactory(){
        return this.sessionFactory;
    }

    private SessionFactory setSessionFactory () {
        if(sessionFactory!=null) {
            return sessionFactory;
        }
        Properties properties = null;
        Configuration configuration = null;
        ServiceRegistry serviceRegistry=null;
        try {
            /** lokalna konfiguracja JDBC*/
            properties = new Properties();
            properties.put(Environment.DRIVER, "org.postgresql.Driver");
            properties.put(Environment.URL, "jdbc:postgresql://localhost:5432/onlineStore"); //"hibernate.connection.url"
            properties.put(Environment.USER, "postgres");
            properties.put(Environment.PASS, "postgres1");
            properties.put(Environment.FORMAT_SQL, "true");
            properties.put(Environment.SHOW_SQL, "true");
            properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            // properties.put(Environment.DIALECT, "PostgresSQL95Dialect");
            properties.put(Environment.HBM2DDL_AUTO, "update"); //actions on tables: update / create / create-drop / none
            //add properties to configuration
            configuration = new Configuration();
            configuration.setProperties(properties);
            /**klasy z adnotacją @Entity */
            configuration.addAnnotatedClass(Users.class);
            configuration.addAnnotatedClass(Book.class);
            configuration.addAnnotatedClass(BoardGame.class);
            configuration.addAnnotatedClass(VideoGame.class);
            configuration.addAnnotatedClass(WebFile.class);
            /**service registry */
            serviceRegistry= new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();

        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
        return configuration.buildSessionFactory(serviceRegistry);
    }

}

