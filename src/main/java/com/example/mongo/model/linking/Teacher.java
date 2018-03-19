package com.example.mongo.model.linking;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.Persistable;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "teachers")
public class Teacher implements Persistable<String> {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    @Indexed(unique = true)
    private String email;

    private TeacherStatus teacherStatus;

    @CreatedDate
    private Date createdOn;

    @LastModifiedDate
    private Date modifiedOn;

    @Override
    public boolean isNew() {
        return id == null;
    }
}
