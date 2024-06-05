package com.riwi.riwi_multimedia.infraestructura.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.riwi_multimedia.api.dto.request.ClassRequest;
import com.riwi.riwi_multimedia.api.dto.response.ClassResponse;
import com.riwi.riwi_multimedia.domain.entities.ClassEntity;
import com.riwi.riwi_multimedia.domain.entities.Lesson;
import com.riwi.riwi_multimedia.domain.repositories.ClassRepository;
import com.riwi.riwi_multimedia.infraestructura.abstract_services.IClassService;
import com.riwi.riwi_multimedia.utils.exceptions.BadRequestException;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClassService implements IClassService{

    // Inyeccion de dependencia
    @Autowired
    private final ClassRepository classRepository;

    // Crear
    @Override
    public ClassResponse create(ClassRequest request) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    // Obtener solo uno
    @Override
    public ClassResponse get(Long id) {

        return this.entityToResponse(this.find(id));
    }

    // Actualizar
    @Override
    public ClassResponse update(ClassRequest request, Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    // ELiominar
    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    // Obtener todo
    @Override
    public Page<ClassResponse> getAll(int page, int size) {

        if (page < 0) page = 0;

        PageRequest paginable = PageRequest.of(page - 1, size);

        return this.classRepository.findAll(paginable)
                    .map(this::entityToResponse);
    }

    // Buscar nombre
    @Override
    public String findByNameOrDescription(String name) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNameOrDescription'");
    }


    // Metodos privados 
        private ClassResponse entityToResponse(ClassEntity entity) {

        Lesson lesson = new Lesson();

        // Verificar si la lección no es nula y copiar propiedades si existe
        if (entity.getLessons() != null) {
            BeanUtils.copyProperties(entity.getLessons(), lesson);
        }

        return ClassResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .description(entity.getDescription())
                .createdAt(entity.getCreatedAt())
                .active(entity.isActive())
                .build();
    }

    private ClassEntity requestToEntity(ClassRequest request) {

        return ClassEntity.builder()
                .name(request.getName())
                .description(request.getDescription())
                .active(request.isActive())
                .build();
    }

    private ClassEntity find(Long id) {

        return this.classRepository.findById(id)
                .orElseThrow(() -> new BadRequestException("No hay clases con el id suministrado"));
    }
    
}
