package com.riwi.riwi_multimedia.infraestructura.abstract_services;

import com.riwi.riwi_multimedia.api.dto.request.StudentRequest;
import com.riwi.riwi_multimedia.api.dto.response.StudentResponse;

public interface IStudentService extends CrudService<StudentRequest, StudentResponse, Long> {
    
    public String findByName(String name);

    public String findByDescription(String description);
}
