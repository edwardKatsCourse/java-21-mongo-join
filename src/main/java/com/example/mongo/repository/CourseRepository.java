package com.example.mongo.repository;

import com.example.mongo.model.linking.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
}
