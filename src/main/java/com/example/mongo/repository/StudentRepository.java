package com.example.mongo.repository;

import com.example.mongo.model.linking.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
