package com.groovypractice.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class testController {

    @GetMapping("/emp/{name}")
    Employee getEmployee(@PathVariable String name){
             new Employee(name,name.size()*10);
    }
}
