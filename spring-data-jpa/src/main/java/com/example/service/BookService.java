package com.example.service;

import com.example.entity.Book;

import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/20.
 */
public interface BookService {
    Book save(Book book);
    List<Book> getAll();
    Book get(int id);
    void delete(int id);
}
