package online_store_app.model;

import online_store_app.services.HibernateSessionFactoryService;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Service
public abstract class Product {
    /**atributes*/
    @Id
    protected int idProduct;
    protected String title;
    protected String author;
    protected String aboutText;
    protected double price;
    protected List<String> listOfTags;
    protected String url;

    @Autowired
    public static HibernateSessionFactoryService hsfs;
    public static HibernateSessionFactoryService getHsfs() {
        return hsfs;
    }



    /**abstract methods*/
    public abstract void addProduct(Product product);
    abstract void updateProduct(Product product);
    abstract  void deleteProduct(Product product);
    abstract Product getProductByID(Integer id);
    public abstract List<Product> getAllProductsFromDB();

    /**default methods*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (idProduct != product.idProduct) return false;
        if (Double.compare(product.price, price) != 0) return false;
        if (title != null ? !title.equals(product.title) : product.title != null) return false;
        if (author != null ? !author.equals(product.author) : product.author != null) return false;
        if (aboutText != null ? !aboutText.equals(product.aboutText) : product.aboutText != null) return false;
        if (listOfTags != null ? !listOfTags.equals(product.listOfTags) : product.listOfTags != null) return false;
        return url != null ? url.equals(product.url) : product.url == null;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idProduct;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (aboutText != null ? aboutText.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (listOfTags != null ? listOfTags.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("idProduct=").append(idProduct);
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", aboutText='").append(aboutText).append('\'');
        sb.append(", price=").append(price);
        sb.append(", listOfTags=").append(listOfTags);
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**getters & setters*/
    @Id
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

    public List<String> getListOfTags() {
        return listOfTags;
    }

    public void setListOfTags(List<String> listOfTags) {
        this.listOfTags = listOfTags;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
