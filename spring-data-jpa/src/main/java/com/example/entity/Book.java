package com.example.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by 史冬阳 on 2018/9/20.
 */
@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private Integer id;
    private String avatar;
    private String name;
    private String author;
    private String price;
    private String introduction;
}
