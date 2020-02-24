package online_store_app.services;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

@Component
public class HibernateSessionFactoryService {
    private static final SessionFactory sessionFactory;
    static {
        try {
        Configuration config = new Configuration();
        sessionFactory = config.configure().buildSessionFactory();
    } catch(Throwable e) {
        System.err.println("Error creating SessionFactory." + e.getMessage());
        throw new ExceptionInInitializerError(e);
    }
}
    public static void main(String[] args) {
        Session session = HibernateSessionFactoryService.getSessionFactory()
                .getCurrentSession();
        System.out.println("session: " + session);
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
/*
        private SessionFactory sessionFactory;

    public HibernateSessionFactoryService() {
        this.sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

        public Session getSession() {
            return this.sessionFactory.openSession();
        }
    }*/
