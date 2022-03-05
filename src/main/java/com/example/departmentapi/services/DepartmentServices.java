package com.example.departmentapi.services;

import com.example.departmentapi.modeal.Department;
import com.example.departmentapi.repositery.DepartmentRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServices implements DepartmentServiceInterface {

    @Autowired
    DepartmentRepositery repo;

    public Department createDepartment(Department department){
        return repo.save(department);
    }

    public List<Department>fetchAllDepartment(){
       List<Department> items = new ArrayList<>();
       repo.findAll().forEach(items::add);
       return  items;
    }


    public Optional<Department> findDepById(String id){
        return repo.findById(id);
    }

    public void deleteDepartment(String id){
        repo.deleteById(id);

    }
    public void deleteAllDepartment(){
        repo.deleteAll();
    }

//    public Department updateInfo(String id){
//       Optional<Department> item= repo.findById(id);
//
//   /*
//
//    */
//
//
//
//
//
//    }


}
