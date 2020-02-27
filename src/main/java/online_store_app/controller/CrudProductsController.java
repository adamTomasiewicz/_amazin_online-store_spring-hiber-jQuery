package online_store_app.controller;

import com.google.gson.Gson;
import online_store_app.model.Book;
import online_store_app.dao.BoardGameDaoImpl;
import online_store_app.dao.BookDaoImpl;
import online_store_app.dao.UsersDaoImpl;
import online_store_app.dao.VideoGameDaoImpl;
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

}
