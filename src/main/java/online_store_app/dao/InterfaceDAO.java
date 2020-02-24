package online_store_app.dao;

import online_store_app.model.AbstractProduct;

import java.util.List;
import java.util.Optional;

public interface InterfaceDAO<T> {

        void addProduct(T t);
        void updateProduct(T t);
        //void deleteProduct(T t, String[] params);
        void deleteProduct(T t);
        Optional<T> getProductByID(Integer id);
        List<T> getAllProductsFromDB();

}