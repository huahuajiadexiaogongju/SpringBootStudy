package com.example.dao;

import com.example.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 史冬阳 on 2018/9/20.
 */
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
