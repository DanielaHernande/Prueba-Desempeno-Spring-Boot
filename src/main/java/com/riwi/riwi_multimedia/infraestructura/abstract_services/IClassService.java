package com.riwi.riwi_multimedia.infraestructura.abstract_services;

import com.riwi.riwi_multimedia.api.dto.request.ClassRequest;
import com.riwi.riwi_multimedia.api.dto.response.ClassResponse;

public interface IClassService extends CrudService<ClassRequest, ClassResponse, Long> {

    public String findByNameOrDescription(String name);

}
