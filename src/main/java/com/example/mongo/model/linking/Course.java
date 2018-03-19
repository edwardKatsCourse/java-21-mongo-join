package com.example.mongo.model.linking;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Document(collection = "courses")
public class Course {

    @Id
    private String id;

    @Indexed(unique = true)
    private String courseName;

    @DBRef
    private Teacher lecturer;
}
