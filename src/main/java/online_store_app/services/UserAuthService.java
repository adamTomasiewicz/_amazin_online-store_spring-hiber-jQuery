package online_store_app.services;

import online_store_app.auth.IUserAuthService;
import online_store_app.auth.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAuthService implements IUserAuthService {
    @Autowired
    public HibernateSessionFactoryService hsfs;

    @Override
    public void saveUser(Users user) {
        Session session = hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }

    @Override
    public void updateUser(Users user) {
        Session session = hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        session.close();
    }


    @Override
    public void deleteUser(Users user) {
        Session session = hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(user);
        tx.commit();
        session.close();
    }

    @Override
    public Users getUserByID(Integer id) {
        Session session = this.hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Users user = (Users) session
                .createQuery("FROM Users WHERE id=" + id)
                .uniqueResult();
        tx.commit();
        session.close();
        return user;
    }

    @Override
    public List<Users> getAllUsers() {
        Session session = this.hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Users> users = session
                .createQuery("FROM User ")
                .list();
        tx.commit();
        session.close();
        return users;
    }
}
