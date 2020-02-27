package online_store_app.dao;


import online_store_app.dao.InterfaceDAO;
import online_store_app.model.VideoGame;
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

@Qualifier("videoGames")
@Component
public class VideoGameDaoImpl implements InterfaceDAO<VideoGame> {
    @Autowired
    private HibernateUtilsSF hibernateUtilsSF;

   /* public VideoGameDaoImpl() {
        this.hibernateUtilsSF = new HibernateUtilsSF();
    }
*/

    @Override
    public void addProduct(VideoGame videoGame) {
        SessionFactory sessionFactory = hibernateUtilsSF.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<VideoGame> videoGames = session.createQuery("from VideoGame ", VideoGame.class).list();
        session.save(videoGame);
        tx.commit();
        session.close();
    }

    @Override
    public void updateProduct(VideoGame videoGame) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(videoGame);
        tx.commit();
        session.close();
    }

    @Override
    public void deleteProduct(VideoGame videoGame) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(videoGame);
        tx.commit();
        session.close();
    }

    @Override
    public Optional<VideoGame> getProductByID(Integer id) {
        Session session = this.hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        VideoGame videoGame = (VideoGame) session
                .createQuery("FROM VideoGame WHERE id=" + id)
                .uniqueResult();
        tx.commit();
        session.close();
        return Optional.ofNullable(videoGame);
    }

    @Override
    public List<VideoGame> getAllProductsFromDB() {
        Session session = this.hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<VideoGame> videoGames = session
                .createQuery("FROM VideoGame ")
                .list();
        tx.commit();
        session.close();
        return videoGames;
    }
}
