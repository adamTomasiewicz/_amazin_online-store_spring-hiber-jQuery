package online_store_app.model;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "videogame")
public class VideoGame extends AbstractProduct {
    /**atributes*/
    @Id
    protected int idProduct;
    protected String title;
    protected String author;
    protected String aboutText;
    protected double price;
    // protected List<String> listOfTags;
    protected String url;
    protected String urlImage;

    public VideoGame() {
    }
    public VideoGame(int idProduct, String title, String author, String urlImage) {
        this.idProduct = idProduct;
        this.title = title;
        this.author = author;
        this.urlImage = urlImage;
    }
    public VideoGame(int idProduct, String title, String author, String aboutText, double price, List<String> listOfTags, String url) {
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
    public String getTitle() { return title; }
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

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
