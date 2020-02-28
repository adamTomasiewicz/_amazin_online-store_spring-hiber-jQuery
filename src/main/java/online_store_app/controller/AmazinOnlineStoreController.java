package online_store_app.controller;


import online_store_app.auth.Users;

import online_store_app.dao.BoardGameDaoImpl;
import online_store_app.dao.BookDaoImpl;
import online_store_app.dao.UsersDaoImpl;
import online_store_app.dao.VideoGameDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AmazinOnlineStoreController {

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

    /** ABOUT-US PAGE MAPPINGS */
    @GetMapping(value = "/aboutUs")
    public String getAboutUs(Model model) {
        // model.addAttribute("user", new Users());
        return "about-us";
    }


}
