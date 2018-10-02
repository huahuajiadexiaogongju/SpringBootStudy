package com.example.dao;

import com.example.entity.PictureList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PictureListRepository extends JpaRepository<PictureList,Integer> {
}
