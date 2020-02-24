package online_store_app.controller;


import online_store_app.auth.Users;
import online_store_app.model.Book;

import online_store_app.model.Product;
import online_store_app.model.VideoGame;
import online_store_app.services.UserAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OnlineStoreController {
    @Autowired
    Product product;
    @Autowired
    UserAuthService userAuthService;

    @GetMapping(value = "")
    public String getIndex(Model model) {
        model.addAttribute("products", product.getAllProductsFromDB());
        return "index";
    }

    @GetMapping(value = "/home")
    public String getHome(Model model) {
        model.addAttribute("products", product.getAllProductsFromDB());
        return "index";
    }

    @GetMapping(value = "/allProducts")
    public String getAllBooks(Model model) {
        model.addAttribute("products", product.getAllProductsFromDB());
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
    public String postSaveBook(@ModelAttribute Product product) {
        product.addProduct(product);
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
