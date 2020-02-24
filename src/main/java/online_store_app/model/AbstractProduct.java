package online_store_app.model;

import java.util.List;


public abstract class AbstractProduct {

    /**atributes*/

    protected int idProduct;
    protected String title;
    protected String author;
    protected String aboutText;
    protected double price;
    // protected List<String> listOfTags;
    protected String url;



    /**abstract methods*/
//    public abstract void addProduct(AbstractProduct abstractProduct);
//    abstract void updateProduct(AbstractProduct abstractProduct);
//    abstract void deleteProduct(AbstractProduct abstractProduct);
//    public abstract AbstractProduct getProductByID(Integer id);
//    public abstract List<AbstractProduct> getAllProductsFromDB();

    /**default methods*/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractProduct abstractProduct = (AbstractProduct) o;
        if (idProduct != abstractProduct.idProduct) return false;
        if (Double.compare(abstractProduct.price, price) != 0) return false;
        if (title != null ? !title.equals(abstractProduct.title) : abstractProduct.title != null) return false;
        if (author != null ? !author.equals(abstractProduct.author) : abstractProduct.author != null) return false;
        if (aboutText != null ? !aboutText.equals(abstractProduct.aboutText) : abstractProduct.aboutText != null) return false;
       // if (listOfTags != null ? !listOfTags.equals(abstractProduct.listOfTags) : abstractProduct.listOfTags != null) return false;
        return url != null ? url.equals(abstractProduct.url) : abstractProduct.url == null;
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
       // result = 31 * result + (listOfTags != null ? listOfTags.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractProduct{");
        sb.append("idProduct=").append(idProduct);
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", aboutText='").append(aboutText).append('\'');
        sb.append(", price=").append(price);
       // sb.append(", listOfTags=").append(listOfTags);
        sb.append(", url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**getters & setters*/

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

/*
   public List<String> getListOfTags() {
        return listOfTags;
    }

   public void setListOfTags(List<String> listOfTags) {
        this.listOfTags = listOfTags;
    }
*/

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
