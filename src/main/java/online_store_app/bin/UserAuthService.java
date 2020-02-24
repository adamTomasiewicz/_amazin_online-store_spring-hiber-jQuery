/*
package online_store_app.auth;

import online_store_app.services.HibernateUtilsSF;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAuthService implements IUserAuthService {
    @Autowired
    public HibernateUtilsSF hibernateUtilsSF;

    @Override
    public void saveUser(Users user) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }

    @Override
    public void updateUser(Users user) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        session.close();
    }


    @Override
    public void deleteUser(Users user) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(user);
        tx.commit();
        session.close();
    }

    @Override
    public Users getUserByID(Integer id) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
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
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Users> users = session
                .createQuery("FROM Users ")
                .list();
        tx.commit();
        session.close();
        return users;
    }
}
*/
