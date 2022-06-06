package service;


import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService extends GeneralService {
    void add(Product product) throws SQLException;

    boolean update(Product product) throws SQLException;

    List <Product> findAllByClass (int cID);
    List<Product> findAllByNameContains(String name);
}
