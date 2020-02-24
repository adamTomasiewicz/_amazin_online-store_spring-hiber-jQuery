package online_store_app.controller;


import online_store_app.auth.Users;

import online_store_app.services.BookDaoImpl;
import online_store_app.services.UsersDaoImpl;
import online_store_app.model.AbstractProduct;
import online_store_app.model.Book;
import online_store_app.model.VideoGame;
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
    UsersDaoImpl userAuthService;

    @GetMapping(value = "")
    public String getIndex(Model model) {
        //model.addAttribute("products", bookDao.getAllProductsFromDB());
        return "index";
    }

    @GetMapping(value = "/home")
    public String getHome(Model model) {
        model.addAttribute("products", bookDao.getAllProductsFromDB());
        return "index";
    }

    @GetMapping(value = "/allProducts")
    public String getAllBooks(Model model) {
        model.addAttribute("products", bookDao.getAllProductsFromDB());
        return "onlineStore";
    }

    @GetMapping(value = "/addProduct")
    public String getAddBooks(Model model) {
        model.addAttribute("product", new VideoGame() {
        });
        return "addProduct";
    }

    @GetMapping(value = "/login")
    public String getLogin(Model model) {
        model.addAttribute("user", new Users());
        return "login";
    }

    @PostMapping(value = "/addProduct")
    public String postSaveBook(@ModelAttribute AbstractProduct abstractProduct) {
        bookDao.addProduct((Book) abstractProduct);
        return "redirect:/allProducts";
    }

    @PostMapping(value = "/login")
    public String postSaveUser(@ModelAttribute Users user) {
        if (user.getEmail().equals("adam") & user.getPassword().equals("adam1")) {
            System.out.println("zalogowano użytkownika adam");
            return "redirect:/home";
        }
        else return "login";
    }
}
