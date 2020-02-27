package online_store_app.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "boardgame")
public class BoardGame extends AbstractProduct {
    /**atributes*/
    @Id
    protected int idProduct;
    protected String title;
    protected String author;
    protected String aboutText;
    protected double price;
    // protected List<String> listOfTags;
    protected String url;

    public BoardGame() {
    }
    public BoardGame(int idProduct, String title, String author, String aboutText, double price) {
        this.idProduct = idProduct;
        this.title = title;
        this.author = author;
        this.aboutText = aboutText;
        this.price = price;
    }

    public BoardGame(int idProduct, String title, String author, String aboutText, double price, List<String> listOfTags, String url) {
        this.idProduct = idProduct;
        this.title = title;
        this.author = author;
        this.aboutText = aboutText;
        this.price = price;
        //this.listOfTags = listOfTags;
        this.url = url;
    }

    public int getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAboutText() {
        return aboutText;
    }
    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
