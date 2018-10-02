package com.example.dao;

import com.example.entity.Album;
import com.example.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/29.
 */

public interface AlbumRepository extends JpaRepository<Album, Integer> {

    @Query("from Album a  order by  a.likes desc ")
    List<Album> findHotAlbums();


}
