package online_store_app.controller;


import online_store_app.dao.BoardGameDaoImpl;
import online_store_app.dao.BookDaoImpl;
import online_store_app.dao.UsersDaoImpl;
import online_store_app.model.AbstractProduct;
import online_store_app.model.Book;
import online_store_app.dao.VideoGameDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GalleryAndCrudController {

    @Autowired
    BookDaoImpl bookDao;
    @Autowired
    BoardGameDaoImpl boardGameDao;
    @Autowired
    VideoGameDaoImpl videoGameDao;
    @Autowired
    UsersDaoImpl userAuthService;

    /** ONLINE-STORE PAGE MAPPINGS */
    @GetMapping(value = "/gallery")
    public String getAllProducts(Model model) {
        model.addAttribute("books", bookDao.getAllProductsFromDB());
        model.addAttribute("boardGames", boardGameDao.getAllProductsFromDB());
        model.addAttribute("videoGames", videoGameDao.getAllProductsFromDB());
        return "gallery";
    }
    /** ADD-PRODUCT PAGE MAPPINGS */
    @GetMapping(value = "/crud")
    public String getCRUD(Model model) {
        model.addAttribute("books", bookDao.getAllProductsFromDB());
        model.addAttribute("boardGames", boardGameDao.getAllProductsFromDB());
        model.addAttribute("videoGames", videoGameDao.getAllProductsFromDB());
        return "crud";
    }

    @PostMapping(value = "/crud")
    public String postSaveBook(@ModelAttribute AbstractProduct abstractProduct) {
        bookDao.addProduct((Book) abstractProduct);
        return "crud";
    }
//    @PostMapping(value = "/crud")
//    public String postSaveBoardGame(@ModelAttribute AbstractProduct abstractProduct) {
//        boardGameDao.addProduct((BoardGame) abstractProduct);
//        return "crud";
//    }
//
//    @PostMapping(value = "/crud")
//    public String postSaveVideoGame(@ModelAttribute AbstractProduct abstractProduct) {
//        videoGameDao.addProduct((VideoGame) abstractProduct);
//        return "crud";
//    }

}
