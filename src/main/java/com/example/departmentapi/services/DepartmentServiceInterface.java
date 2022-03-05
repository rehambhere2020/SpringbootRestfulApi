package com.example.departmentapi.services;

import com.example.departmentapi.modeal.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentServiceInterface {
    Department createDepartment(Department department);
    List<Department> fetchAllDepartment();
    Optional<Department> findDepById(String id);
//   Department updateInfo(Department department, String id);
    void deleteDepartment(String id);
     void deleteAllDepartment();

}
