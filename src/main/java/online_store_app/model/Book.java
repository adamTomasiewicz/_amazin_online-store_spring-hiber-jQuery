package online_store_app.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "book")
public class Book extends AbstractProduct {
    /**atributes*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int idProduct;
   // @Column(name="title", nullable = false, length = 50, updatable = true)
    protected String title;
    protected String author;
    protected String aboutText;
    protected double price;
    // protected List<String> listOfTags;
    protected String url;

    public Book() {
    }
    public Book(int idProduct, String title, String author, String aboutText, double price, List<String> listOfTags, String url) {
        this.idProduct = idProduct;
        this.title = title;
        this.author = author;
        this.aboutText = aboutText;
        this.price = price;
        //this.listOfTags = listOfTags;
        this.url = url;
    }

    public Book(int idProduct, String title, String author, String aboutText, double price) {
        this.idProduct = idProduct;
        this.title = title;
        this.author = author;
        this.aboutText = aboutText;
        this.price = price;
    }

    @Override
    public int getIdProduct() {
        return idProduct;
    }

    @Override
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getAboutText() {
        return aboutText;
    }

    @Override
    public void setAboutText(String aboutText) {
        this.aboutText = aboutText;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getUrl() {
        return url;
    }

    @Override
    public void setUrl(String url) {
        this.url = url;
    }


}
