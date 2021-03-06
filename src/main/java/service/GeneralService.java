package service;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface GeneralService <T>{
    public List<T> findAll();

    public void add(T t)throws SQLException;

    public T findById(int id);

    public boolean update(T t) throws  SQLException;

    public boolean delete(int id) throws SQLException;

    public List<T> findByName(String name);

    public List<T> findAllOrderByAge();

    List<Product> findAllByCategory(int parseInt);
}