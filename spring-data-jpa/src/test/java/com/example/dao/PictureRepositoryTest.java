package com.example.dao;

import com.example.entity.Picture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PictureRepositoryTest {
    @Resource
    private PictureRepository pictureRepository;

    @Test
    public void initData(){
        Picture[] pictures = {
                new Picture("https://upload.jianshu.io/collections/images/21/20120316041115481.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"),
                new Picture("https://upload.jianshu.io/collections/images/283250/%E6%BC%AB%E7%94%BB%E4%B8%93%E9%A2%98.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"),
                new Picture("https://upload.jianshu.io/collections/images/14/6249340_194140034135_2.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"),
                new Picture("https://upload.jianshu.io/collections/images/83/1.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"),
                new Picture("https://upload.jianshu.io/collections/images/4/sy_20091020135145113016.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"),
                new Picture("https://upload.jianshu.io/collections/images/30/IMG_2226.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"),
                new Picture("https://upload.jianshu.io/collections/images/16/computer_guy.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"),
                new Picture("https://upload.jianshu.io/collections/images/514184/WechatIMG959.jpeg?imageMogr2/auto-orient/strip|imageView2/1/w/180/h/180"),
        };
        for (int i=0;i<pictures.length;i++){
            pictureRepository.save(pictures[i]);
        }
    }


}