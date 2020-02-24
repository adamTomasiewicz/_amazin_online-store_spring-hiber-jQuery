package online_store_app.services;

import online_store_app.dao.InterfaceDAO;
import online_store_app.model.Book;
import online_store_app.services.HibernateUtilsSF;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Qualifier("books")
@Component
public class BookDaoImpl implements InterfaceDAO<Book> {
    @Autowired
    protected HibernateUtilsSF hibernateUtilsSF;

    @Override
    public void addProduct(Book book) {
        SessionFactory sessionFactory = hibernateUtilsSF.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<Book> books = session.createQuery("from Book ", Book.class).list();
        session.save(books);
        tx.commit();
        session.close();
    }

    @Override
    public void updateProduct(Book book) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(book);
        tx.commit();
        session.close();
    }


    @Override
    public void deleteProduct(Book book) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(book);
        tx.commit();
        session.close();
    }

    @Override
    public Optional<Book> getProductByID(Integer id){
    Session session = this.hibernateUtilsSF.getSessionFactory().getCurrentSession();
    Transaction tx = session.beginTransaction();
    Book book = (Book) session
            .createQuery("FROM Book WHERE id=" + id)
            .uniqueResult();
        tx.commit();
        session.close();
        return Optional.ofNullable(book);
    }

    @Override
    public List<Book> getAllProductsFromDB() {
    Session session = this.hibernateUtilsSF.getSessionFactory().getCurrentSession();
    Transaction tx = session.beginTransaction();
    List<Book> books = session
            .createQuery("FROM Book ")
            .list();
        tx.commit();
        session.close();
        return books;
    }





}
