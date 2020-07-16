package com.aode.controller;

import com.aode.bean.Department;
import com.aode.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("depts")
    public String getDept(){
      List<Department> depts = departmentService.getAll();
        return "test";
    }
}
