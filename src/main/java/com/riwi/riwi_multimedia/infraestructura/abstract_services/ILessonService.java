package com.riwi.riwi_multimedia.infraestructura.abstract_services;

import com.riwi.riwi_multimedia.api.dto.request.LessonRequest;
import com.riwi.riwi_multimedia.api.dto.response.LessonResponse;

public interface ILessonService extends CrudService<LessonRequest, LessonResponse, Long> {
    
}
