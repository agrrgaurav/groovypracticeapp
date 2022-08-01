package com.groovypractice.example

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class testController {

    @GetMapping("/emp/{id}/{name}/{age}")
    Employee getEmployee(@PathVariable int id , @PathVariable String name , @PathVariable int age){
        new Employee(id,name,age);
    }

}
