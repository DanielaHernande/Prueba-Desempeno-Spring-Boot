package com.riwi.riwi_multimedia.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.riwi.riwi_multimedia.domain.entities.Multimedia;

public interface MultimediaRepository extends JpaRepository<Multimedia, Long>{
    
}
