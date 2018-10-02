package com.example.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 史冬阳 on 2018/9/29.
 */
@Entity
@Data
@Table(name = "picture")
public class Picture {
    @Id
    @GeneratedValue
    private Integer id;
    private String pictureLink;

    public Picture(String pictureLink) {
        this.pictureLink = pictureLink;
    }
}
