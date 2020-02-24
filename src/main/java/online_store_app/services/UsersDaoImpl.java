package online_store_app.services;

import online_store_app.auth.Users;
import online_store_app.dao.InterfaceDAO;
import online_store_app.services.HibernateUtilsSF;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Qualifier("users")
@Component
public class UsersDaoImpl implements InterfaceDAO<Users> {

    private HibernateUtilsSF hibernateUtilsSF;

    public UsersDaoImpl() {
        this.hibernateUtilsSF = new HibernateUtilsSF();
    }


    @Override
    public void addProduct(Users user) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }

    @Override
    public void updateProduct(Users user) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
        session.close();
    }

    @Override
    public void deleteProduct(Users user) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(user);
        tx.commit();
        session.close();
    }

    @Override
    public Optional<Users> getProductByID(Integer id) {
            Session session = this.hibernateUtilsSF.getSessionFactory().getCurrentSession();
            Transaction tx = session.beginTransaction();
            Users user = (Users) session
                    .createQuery("FROM Users WHERE id=" + id)
                    .uniqueResult();
            tx.commit();
            session.close();
            return Optional.ofNullable(user);

    }

        @Override
        public List<Users> getAllProductsFromDB(){
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
