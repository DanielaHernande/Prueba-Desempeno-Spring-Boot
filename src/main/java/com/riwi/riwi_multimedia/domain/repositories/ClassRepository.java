package com.riwi.riwi_multimedia.domain.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.riwi.riwi_multimedia.domain.entities.ClassEntity;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Long>{
    
    public Optional<ClassEntity> findByName(String name);
}
