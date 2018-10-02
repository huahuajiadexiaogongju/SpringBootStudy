package com.example.dao;

import com.example.entity.Album;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by 史冬阳 on 2018/9/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AlbumRepositoryTest {
    @Resource
    private AlbumRepository albumRepository;

    @Test
    public void  initData(){
        Album[] albums = {
                new Album("https://upload.jianshu.io/collections/images/11/20100120161805563.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180","孩子","当孩子还是孩子的时候，他挥舞一下双手，这水洼便成为大海。",56),
                new Album("https://upload.jianshu.io/collections/images/21/20120316041115481.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180","发丝逐与月色融，前程尚须一世圆","夜晚的小巷",189),
                new Album("https://upload.jianshu.io/collections/images/83/1.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180","南法的建筑与街道","历史古迹与人文艺术在阿尔勒有了很好的交汇",120),
                new Album("https://upload.jianshu.io/collections/images/4/sy_20091020135145113016.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180","暴饮暴食的中秋后解解腻~","随手一拍就是ins里的美图",89),
                new Album("https://upload.jianshu.io/collections/images/16/computer_guy.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180","意大利，阿尔贝罗贝洛小镇","据说是当地人为了逃税而这样建造，收税时就把屋顶拆掉，表示这里没人",25),
                new Album("https://upload.jianshu.io/collections/images/514184/WechatIMG959.jpeg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180","四海为家","小时候觉得“四海为家”这个词是很酷的，四海之内到处都可以成为家。",256),
        };
        for (int i = 0 ; i < 6 ; i++ ){
            albumRepository.save(albums[i]);
        }
    }

    @Test
    public void findHotAlbums() throws Exception {
        List<Album> albums = albumRepository.findHotAlbums();
        albums.forEach(album -> System.out.println(album));
    }

}