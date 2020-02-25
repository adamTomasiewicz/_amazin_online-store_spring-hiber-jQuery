package online_store_app.controller;


import online_store_app.auth.Users;

import online_store_app.model.BoardGame;
import online_store_app.services.BoardGameDaoImpl;
import online_store_app.services.BookDaoImpl;
import online_store_app.services.UsersDaoImpl;
import online_store_app.model.AbstractProduct;
import online_store_app.model.Book;
import online_store_app.model.VideoGame;
import online_store_app.services.VideoGameDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OnlineStoreController {

    @Autowired
    BookDaoImpl bookDao;
    @Autowired
    BoardGameDaoImpl boardGameDao;
    @Autowired
    VideoGameDaoImpl videoGameDao;
    @Autowired
    UsersDaoImpl userAuthService;

    /** INDEX PAGE MAPPINGS */
    @GetMapping(value = "")
    public String getEmpty(Model model) {
        model.addAttribute("books", bookDao.getAllProductsFromDB());
        model.addAttribute("boardGames", boardGameDao.getAllProductsFromDB());
       model.addAttribute("videoGames", videoGameDao.getAllProductsFromDB());
        return "index";
    }
    @GetMapping(value = "/home")
    public String getHome(Model model) {
        model.addAttribute("books", bookDao.getAllProductsFromDB());
        model.addAttribute("boardGames", boardGameDao.getAllProductsFromDB());
        model.addAttribute("videoGames", videoGameDao.getAllProductsFromDB());
        return "index";
    }
    @GetMapping(value = "/index")
    public String getIndex(Model model) {
        model.addAttribute("books", bookDao.getAllProductsFromDB());
        model.addAttribute("boardGames", boardGameDao.getAllProductsFromDB());
        model.addAttribute("videoGames", videoGameDao.getAllProductsFromDB());
        return "index";
    }
    /** ONLINE-STORE PAGE MAPPINGS */
    @GetMapping(value = "/onlineStore")
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookDao.getAllProductsFromDB());
        model.addAttribute("boardGames", boardGameDao.getAllProductsFromDB());
        model.addAttribute("videoGames", videoGameDao.getAllProductsFromDB());
        return "online-store";
    }
    /** ADD-PRODUCT PAGE MAPPINGS */
    @GetMapping(value = "/addProduct")
    public String getAddBooks(Model model) {
        model.addAttribute("book", new Book());
        model.addAttribute("boardGames", new BoardGame());
        model.addAttribute("videoGames", new VideoGame());
        return "add-product";
    }
    @PostMapping(value = "/addProduct")
    public String postSaveBook(@ModelAttribute AbstractProduct abstractProduct) {

        bookDao.addProduct((Book) abstractProduct);
        return "redirect:/onlineStore";
    }
    /** ABOUT-US PAGE MAPPINGS */
    @GetMapping(value = "/aboutUs")
    public String getAboutUs(Model model) {
        // model.addAttribute("user", new Users());
        return "about-us";
    }

    /** MY-ACCOUNT PAGE MAPPINGS */
    @GetMapping(value = "/myAccount")
    public String getMyAccount(Model model) {
       // model.addAttribute("user", new Users());
        return "my-account";
    }

    @PostMapping(value = "/myAccount")
    public String postSaveUser(@ModelAttribute Users user) {
        if (user.getEmail().equals("adam") & user.getPassword().equals("adam1")) {
            System.out.println("zalogowano użytkownika adam");
            return "redirect:/home";
        }
        else return "my-account";
    }
}
