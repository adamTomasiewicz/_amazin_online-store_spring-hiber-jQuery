/*
package online_store_app.bin;

import online_store_app.model.AbstractProduct;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public interface InterfaceJPA {

    default void addProduct(AbstractProduct abstractProduct) {
        Session session = hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(abstractProduct);
        tx.commit();
        session.close();
    }

   default void updateProduct(AbstractProduct abstractProduct) {
        Session session = hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(abstractProduct);
        tx.commit();
        session.close();
    }

    default void deleteProduct(AbstractProduct abstractProduct) {
        Session session = hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(abstractProduct);
        tx.commit();
        session.close();
    }

   default AbstractProduct getProductByID(Integer id) {
        Session session = this.hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        AbstractProduct abstractProduct = (AbstractProduct) session
                .createQuery("FROM Product WHERE id=" + id)
                .uniqueResult();
        tx.commit();
        session.close();
        return abstractProduct;
    }

    default List<AbstractProduct> getAllProductsFromDB() {
        Session session = this.hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<AbstractProduct> abstractProducts = session
                .createQuery("FROM Product ")
                .list();
        tx.commit();
        session.close();
        return abstractProducts;
    }
}
*/
