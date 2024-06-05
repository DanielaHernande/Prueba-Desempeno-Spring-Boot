package com.riwi.riwi_multimedia.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.riwi_multimedia.domain.entities.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Long>{
    
}
