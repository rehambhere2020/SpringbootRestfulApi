package com.example.departmentapi.repositery;

import com.example.departmentapi.modeal.Department;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepositery extends MongoRepository<Department,String> {
}
