package domain;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {

    private List<Product> producten;

    public ProductDB() {
        producten = new ArrayList<>();
    }


    public Product getProductById(String id){
        Product found = null;
        for (Product p: producten){
            if (p.getId().equals(id)){
                found = p;
                break;
            }
        }
        return found;
    }

    public void addProduct(Product p){
        producten.add(p);
    }
}
