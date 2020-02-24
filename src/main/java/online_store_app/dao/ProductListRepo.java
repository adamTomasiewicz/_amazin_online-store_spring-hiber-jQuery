package online_store_app.dao;

import online_store_app.model.BoardGame;
import online_store_app.model.Book;
import online_store_app.model.Product;
import online_store_app.model.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class ProductListRepo {
    private static List<Product> listOfProducts = new ArrayList<Product>();

//int idProduct; String title; String author; String aboutText; double price; List<String> listOfTags;String url;
    static {
        listOfProducts.add(new Book(1,"Wiedzmin", "Andrzej Sapkowski","Samotny mściciel walczy z potworami", 34.99,
                List.of("#witcher","#wiedzmin","#fantasy"),"someURL"));
        listOfProducts.add(new Book(2,"Core Java for the Impatient", "Cay S. Horstman","Podstawy programowania w Javie", 48.99,
                List.of("#java","#programing","#fantasy"),"https://www.horstmann.com/"));
        listOfProducts.add(new Book(3,"Zbrodnia i kara","Fiodor Dostojewski", "Opowieść o losach losy byłego studenta, Rodiona Raskolnikowa, który postanawia zamordować i obrabować starą lichwiarkę", 19.49,
                List.of("#dostojewski","#zbrodniaikara","#novel"),"someURL"));
        listOfProducts.add(new BoardGame(4,"Munchkin","somecompany","sometext",58.99));
        listOfProducts.add(new BoardGame(5,"Dixit","somecompany","sometext",58.99));
        listOfProducts.add(new BoardGame(6,"Neuroshima Hex","somecompany","sometext",58.99));

        listOfProducts.add(new VideoGame(7, "The Witcher 3 Wild Hunt", "CD PRojekt","someText", 78.99));
        listOfProducts.add(new VideoGame(8,"DotA2", "Valve", "someText", 0.0));
    listOfProducts.add(new VideoGame(9, "Mahjong","Weronika i Marcin","Gra napisana w technologii Swing", 1599,
            List.of("#mahjong"), "someURL"));
    }

    public static List<Product> getAllProducts () {
        return listOfProducts;
    }

}
