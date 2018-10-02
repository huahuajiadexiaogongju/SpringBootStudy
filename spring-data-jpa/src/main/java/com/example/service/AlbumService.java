package com.example.service;

import com.example.entity.Album;

import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/29.
 */
public interface AlbumService {
    List<Album> findHotAlbums();

    Album get(int id);

    List<Album> getAll();
}
