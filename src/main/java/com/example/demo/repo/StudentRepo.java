package com.example.demo.repo;

import com.example.demo.models.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
// CRUD - Create, Read, Update, Delete
public interface StudentRepo extends CrudRepository<Student, Long> {}
