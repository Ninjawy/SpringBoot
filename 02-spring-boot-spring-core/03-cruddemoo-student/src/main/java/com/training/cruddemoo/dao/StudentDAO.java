package com.training.cruddemoo.dao;

import com.training.cruddemoo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll(String theLastName);
}
