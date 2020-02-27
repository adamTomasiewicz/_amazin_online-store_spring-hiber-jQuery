package online_store_app.services;

import online_store_app.dao.BoardGameDaoImpl;
import online_store_app.dao.BookDaoImpl;
import online_store_app.dao.VideoGameDaoImpl;
import online_store_app.model.BoardGame;
import online_store_app.model.Book;
import online_store_app.model.VideoGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AbstractProductUtils {

    final
    BookDaoImpl bookDao;
    final
    BoardGameDaoImpl boardGameDao;
    final
    VideoGameDaoImpl videoGameDao;

    public AbstractProductUtils(BookDaoImpl bookDao, BoardGameDaoImpl boardGameDao, VideoGameDaoImpl videoGameDao) {
        this.bookDao = bookDao;
        this.boardGameDao = boardGameDao;
        this.videoGameDao = videoGameDao;
    }


    //int idProduct; String title; String author; String aboutText; double price; List<String> listOfTags;String url;
//    public void loadData(){
//        bookDao.addProduct(new Book(1,"Wiedzmin", "Andrzej Sapkowski",
//                "Samotny mściciel walczy z potworami", 34.99,
//                List.of("#witcher","#wiedzmin","#fantasy"),"someURL"));
//        bookDao.addProduct(new Book(2,"Core Java for the Impatient", "Cay S. Horstman",
//                "Podstawy programowania w Javie", 48.99,
//                List.of("#java","#programing","#fantasy"),"https://www.horstmann.com/"));
//        bookDao.addProduct(new Book(3,"Zbrodnia i kara","Fiodor Dostojewski",
//                "Opowieść o losach losy byłego studenta, Rodiona Raskolnikowa, który postanawia zamordować i obrabować starą lichwiarkę", 19.49,
//                List.of("#dostojewski","#zbrodniaikara","#novel"),"someURL"));
//        boardGameDao.addProduct(new BoardGame(4,"Munchkin","somecompany","sometext",58.99));
//        boardGameDao.addProduct(new BoardGame(5,"Dixit","somecompany","sometext",58.99));
//        boardGameDao.addProduct(new BoardGame(6,"Neuroshima Hex","somecompany","sometext",58.99));
//        videoGameDao.addProduct(new VideoGame(7, "The Witcher 3 Wild Hunt", "CD PRojekt","someText", 78.99));
//        videoGameDao.addProduct(new VideoGame(8,"DotA2", "Valve", "someText", 0.0));
//        videoGameDao.addProduct(new VideoGame(9, "Mahjong","Weronika i Marcin",
//                "Gra napisana w technologii Swing", 1599,
//                List.of("#mahjong"), "someURL"));
//    }


}
