package com.example.mongo.model.linking;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TeacherStatus {
    LECTURER(1),
    DEAN(2),
    CONSULTANT(3);

    private Integer id;
}
