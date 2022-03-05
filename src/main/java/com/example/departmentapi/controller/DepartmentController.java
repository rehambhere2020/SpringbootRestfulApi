package com.example.departmentapi.controller;
import com.example.departmentapi.modeal.Department;
import com.example.departmentapi.services.DepartmentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    @Autowired
    private DepartmentServiceInterface departmentServices;

    @PostMapping(value = {"","/"})
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
       Department item= departmentServices.createDepartment(department);
       return new ResponseEntity<>(item, HttpStatus.CREATED);
    }
@GetMapping(value = {"","/"})
   public  ResponseEntity<List<Department>> getAll(){
  List<Department>  ListItems= departmentServices.fetchAllDepartment();
if(ListItems.isEmpty()){
    return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
  return  new ResponseEntity<>(ListItems,HttpStatus.OK);

}


@GetMapping(value = "/{id}")
    public ResponseEntity<Department> findDepartmentById(@PathVariable String id){

       Optional<Department> data= departmentServices.findDepById(id);
       if(data.isPresent()){
           return  new ResponseEntity<>(data.get(),HttpStatus.OK);
       }else {
           return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
}

@GetMapping(value = "/{id}")
    public ResponseEntity<HttpStatus> deleteDepartment(@PathVariable  String id){
        departmentServices.deleteDepartment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
}
    @DeleteMapping(value = {"","/"})
    public ResponseEntity<HttpStatus> deleteAllDepartments() {
        departmentServices.deleteAllDepartment();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
