package com.riwi.riwi_multimedia.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.riwi_multimedia.api.dto.response.ClassResponse;
import com.riwi.riwi_multimedia.infraestructura.abstract_services.IClassService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/class")
public class ClassController {
    
    @Autowired
    private final IClassService classService;

    // Buscar todo
    @GetMapping
    public ResponseEntity<Page<ClassResponse>> getAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "6") int size
    ) {

        return ResponseEntity.ok(this.classService.getAll(page, size));
    }

    // Buscar por uno solo
    @GetMapping(path = "/{id}")
    public ResponseEntity<ClassResponse> get(
            @PathVariable Long id
    ) {

        return ResponseEntity.ok(this.classService.get(id));
    }
}
