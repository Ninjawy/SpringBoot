package com.training.cruddemoo.dao;

import com.training.cruddemoo.entity.Student;
import jakarta.persistence.EntityManager;

public class StudentDAOImpl implements StudentDAO {

    // define field for entity manager
    private EntityManager entityManager;
    // inject entity manager using constructor injection

    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    public void save (Student theStudent) {

    }
}
