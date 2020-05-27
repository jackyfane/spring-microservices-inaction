package com.yaomalang.eagleeye.licenses.services;

public interface BaseService<T> {

    public void save(T entity);

    public T findOneById(String id);

    public void deleteById(String id);

    public void update(T entity);
}
