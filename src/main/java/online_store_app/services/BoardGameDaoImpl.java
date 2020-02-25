package online_store_app.services;


import online_store_app.dao.InterfaceDAO;
import online_store_app.model.BoardGame;
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
@Qualifier("boardGames")
@Component
public class BoardGameDaoImpl implements InterfaceDAO<BoardGame> {

    @Autowired
    private HibernateUtilsSF hibernateUtilsSF;

   /* public BoardGameDaoImpl() {
        this.hibernateUtilsSF = new HibernateUtilsSF();
    }*/


    @Override
    public void addProduct(BoardGame boardGame) {
        SessionFactory sessionFactory = hibernateUtilsSF.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<BoardGame> boardGames = session.createQuery("from BoardGame ", BoardGame.class).list();
        session.save(boardGame);
        tx.commit();
        session.close();
    }

    @Override
    public void updateProduct(BoardGame boardGame) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.update(boardGame);
        tx.commit();
        session.close();
    }

    @Override
    public void deleteProduct(BoardGame boardGame) {
        Session session = hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        session.delete(boardGame);
        tx.commit();
        session.close();
    }

    @Override
    public Optional<BoardGame> getProductByID(Integer id) {
        Session session = this.hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        BoardGame boardGame = (BoardGame) session
                .createQuery("FROM VideoGame WHERE id=" + id)
                .uniqueResult();
        tx.commit();
        session.close();
        return Optional.ofNullable(boardGame);
    }

    @Override
    public List<BoardGame> getAllProductsFromDB() {
        Session session = this.hibernateUtilsSF.getSessionFactory().getCurrentSession();
        Transaction tx = session.beginTransaction();
        List<BoardGame> boardGames = session
                .createQuery("FROM BoardGame ")
                .list();
        tx.commit();
        session.close();
        return boardGames;
    }
}
