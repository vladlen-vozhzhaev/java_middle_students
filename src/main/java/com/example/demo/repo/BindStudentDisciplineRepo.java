package com.example.demo.repo;

import com.example.demo.models.BindStudentDiscipline;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BindStudentDisciplineRepo extends CrudRepository<BindStudentDiscipline, Long> {
}