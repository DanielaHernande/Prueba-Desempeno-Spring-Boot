package com.riwi.riwi_multimedia.domain.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.riwi.riwi_multimedia.domain.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    public Optional<Student> findByName(String name);
}
