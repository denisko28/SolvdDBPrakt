package com.solvd.DAO;

public interface IBaseDAO<T> {
    T getById(Integer id);

    void insert(T entity);

    void update(T entity);

    void delete(Integer id);
}
