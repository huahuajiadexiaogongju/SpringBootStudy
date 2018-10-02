package com.example.album.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

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
