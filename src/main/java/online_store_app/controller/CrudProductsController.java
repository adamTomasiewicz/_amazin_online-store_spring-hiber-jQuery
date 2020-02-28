package online_store_app.controller;

import com.google.gson.Gson;
import online_store_app.model.BoardGame;
import online_store_app.model.Book;
import online_store_app.dao.BoardGameDaoImpl;
import online_store_app.dao.BookDaoImpl;
import online_store_app.dao.UsersDaoImpl;
import online_store_app.dao.VideoGameDaoImpl;
import online_store_app.model.VideoGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CrudProductsController {

        BookDaoImpl bookDao;
        BoardGameDaoImpl boardGameDao;
        VideoGameDaoImpl videoGameDao;
        UsersDaoImpl userAuthService;
        @Autowired
        public CrudProductsController(BookDaoImpl bookDao, BoardGameDaoImpl boardGameDao, VideoGameDaoImpl videoGameDao, UsersDaoImpl userAuthService) {
                this.bookDao = bookDao;
                this.boardGameDao = boardGameDao;
                this.videoGameDao = videoGameDao;
                this.userAuthService = userAuthService;
        }


        @PostMapping(value = "/product/book/create")
        public String createBook(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();

                bookDao.addProduct((Book)g.fromJson(jsonString, Book.class));

                return null;
        }

        @PutMapping (value = "/product/book/update")
        public String updateBook(@RequestBody String jsonString){
            System.out.println(jsonString);
            Gson g = new Gson();
            bookDao.updateProduct(g.fromJson(jsonString, Book.class));

            return null;
        }

        @DeleteMapping (value = "/product/book/delete")
        public String deleteBook(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                bookDao.deleteProduct(g.fromJson(jsonString, Book.class));

                return null;
        }


        @PostMapping(value = "/product/boardgame/create")
        public String createBoardGame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                boardGameDao.addProduct((BoardGame) g.fromJson(jsonString, BoardGame.class));

                return null;
        }

        @PutMapping (value = "/product/boardgame/update")
        public String updateBoardGame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                boardGameDao.updateProduct(g.fromJson(jsonString, BoardGame.class));

                return null;
        }

        @DeleteMapping (value = "/product/boardgame/delete")
        public String deleteBoardGame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                boardGameDao.deleteProduct(g.fromJson(jsonString, BoardGame.class));

                return null;
        }


        @PostMapping(value = "/product/videogame/create")
        public String createVideoGame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();

                videoGameDao.addProduct(g.fromJson(jsonString, VideoGame.class));

                return null;
        }

        @PutMapping (value = "/product/videogame/update")
        public String updateVideoGame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                videoGameDao.updateProduct(g.fromJson(jsonString, VideoGame.class));

                return null;
        }

        @DeleteMapping (value = "/product/videogame/delete")
        public String deleteVideoGame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                videoGameDao.deleteProduct(g.fromJson(jsonString, VideoGame.class));

                return null;
        }







}
