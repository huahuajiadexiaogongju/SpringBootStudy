package com.example.service;

import com.example.entity.Student;

import java.util.List;

/**
 * Created by 史冬阳 on 2018/9/20.
 */
public interface StudentService {
    Student save(Student student);
    List<Student> getAll();
    Student get(int id);
    void delete(int id);
}
