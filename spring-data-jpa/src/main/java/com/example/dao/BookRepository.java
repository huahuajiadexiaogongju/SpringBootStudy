package com.example.dao;

import com.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 史冬阳 on 2018/9/20.
 */

/**
 * Integer 唯一标识符 数据库的主键
 */
public interface BookRepository extends JpaRepository<Book,Integer> {
}
