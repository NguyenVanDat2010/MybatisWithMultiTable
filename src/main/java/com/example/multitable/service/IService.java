package com.example.multitable.service;

import java.util.List;

/**
 * @author nvdat2
 */
public interface IService<T> {
    public List<T> findAll();

    public T findById(Long id);

    public int deleteById(Long id);

    public int update(T t);

    public int insert(T t);
}
