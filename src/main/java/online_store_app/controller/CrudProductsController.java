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

        @Autowired
        BookDaoImpl bookDao = new BookDaoImpl();
        @Autowired
        BoardGameDaoImpl boardGameDao = new BoardGameDaoImpl();
        @Autowired
        VideoGameDaoImpl videoGameDao=new VideoGameDaoImpl();
        @Autowired
        UsersDaoImpl userAuthService;

        /** ONLINE-STORE PAGE MAPPINGS */
//        @PostMapping(value = "/crud")
//        public String postSaveBook(@ModelAttribute AbstractProduct abstractProduct) {
//            bookDao.addProduct((Book) abstractProduct);
//            return "crud";
//        }

        @PostMapping(value = "/product/book/create")
        public String getJSON(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();

                bookDao.addProduct((Book)g.fromJson(jsonString, Book.class));

                return null;
        }

        @PutMapping (value = "/product/book/update")
        public String ubdateBook(@RequestBody String jsonString){
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
        public String getJSONbGame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                boardGameDao.addProduct((BoardGame) g.fromJson(jsonString, BoardGame.class));

                return null;
        }

        @PutMapping (value = "/product/boardgame/update")
        public String ubdateBoardgame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                boardGameDao.updateProduct(g.fromJson(jsonString, BoardGame.class));

                return null;
        }

        @DeleteMapping (value = "/product/boardgame/delete")
        public String deleteBoardgame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                boardGameDao.deleteProduct(g.fromJson(jsonString, BoardGame.class));

                return null;
        }


        @PostMapping(value = "/product/videogame/create")
        public String getJSONvGame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();

                videoGameDao.addProduct(g.fromJson(jsonString, VideoGame.class));

                return null;
        }

        @PutMapping (value = "/product/videogame/update")
        public String ubdateVideogame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                videoGameDao.updateProduct(g.fromJson(jsonString, VideoGame.class));

                return null;
        }

        @DeleteMapping (value = "/product/videogame/delete")
        public String deleteVideogame(@RequestBody String jsonString){
                System.out.println(jsonString);
                Gson g = new Gson();
                videoGameDao.deleteProduct(g.fromJson(jsonString, VideoGame.class));

                return null;
        }







}
