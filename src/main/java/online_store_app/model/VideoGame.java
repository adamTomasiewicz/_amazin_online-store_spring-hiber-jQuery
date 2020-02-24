package online_store_app.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class VideoGame extends Product {
    public VideoGame() {
    }
    public VideoGame(int idProduct, String title, String author, String aboutText, double price) {
        this.idProduct = idProduct;
        this.title = title;
        this.author = author;
        this.aboutText = aboutText;
        this.price = price;
    }
    public VideoGame(int idProduct, String title, String author, String aboutText, double price, List<String> listOfTags, String url) {
        this.idProduct = idProduct;
        this.title = title;
        this.author = author;
        this.aboutText = aboutText;
        this.price = price;
        this.listOfTags = listOfTags;
        this.url = url;
    }


    @Override
    public void addProduct(Product product) {
        Session session = hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        session.close();
    }

    @Override
    public void updateProduct(Product product) {
        Session session = hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(product);
        tx.commit();
        session.close();
    }

    @Override
    public void deleteProduct(Product product) {
        Session session = hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(product);
        tx.commit();
        session.close();
    }

    @Override
    public Product getProductByID(Integer id) {
        Session session = this.hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        Product product = (Product) session
                .createQuery("FROM Product WHERE id=" + id)
                .uniqueResult();
        tx.commit();
        session.close();
        return product;
    }

    @Override
    public List<Product> getAllProductsFromDB() {
        Session session = this.hsfs.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<Product> products = session
                .createQuery("FROM Product ")
                .list();
        tx.commit();
        session.close();
        return products;
    }
}
