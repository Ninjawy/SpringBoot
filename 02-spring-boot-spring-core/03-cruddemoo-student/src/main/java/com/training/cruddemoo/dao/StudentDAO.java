package com.training.cruddemoo.dao;

import com.training.cruddemoo.entity.Student;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);
}
