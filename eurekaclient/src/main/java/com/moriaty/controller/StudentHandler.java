package com.moriaty.controller;

import com.moriaty.entity.Student;
import com.moriaty.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = "/student")
public class StudentHandler {

    @Value("${server.port}")
    private String port;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(value = "/findAll")
    public Collection<Student> findAll(){
        return studentRepository.findAll();
    }

    @GetMapping(value = "/findById/{id}")
    public Student findId(@PathVariable("id")long id){
        return studentRepository.findById(id);
    }

    @PostMapping(value = "/save")
    public void save(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping(value = "/update")
    public void update(@RequestBody Student student){
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id){
        studentRepository.deleteById(id);
    }

    @GetMapping(value = "/index")
    public String index(){
        return "当前端口" + port;
    }
}
