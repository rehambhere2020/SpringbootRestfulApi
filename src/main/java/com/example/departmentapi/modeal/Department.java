package com.example.departmentapi.modeal;

import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "department")
public class Department {
    private String id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;



    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
