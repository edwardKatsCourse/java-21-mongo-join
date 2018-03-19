package com.example.mongo.repository;

import com.example.mongo.model.linking.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher, String> {
}
