package com.example.service.impl;

import com.example.dao.AlbumRepository;
import com.example.entity.Album;
import com.example.service.AlbumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/29.
 */
@Service
public class AlbumServiceImpl implements AlbumService {
    @Resource
    private AlbumRepository albumRepository;

    @Override
    public List<Album> findHotAlbums() {
        return albumRepository.findHotAlbums();
    }

    @Override
    public Album get(int id) {
        return albumRepository.findById(id).get();
    }

    @Override
    public List<Album> getAll() {
        return albumRepository.findAll();
    }
}
