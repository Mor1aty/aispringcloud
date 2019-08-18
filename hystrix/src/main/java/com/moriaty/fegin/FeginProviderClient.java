package com.moriaty.fegin;

import com.moriaty.entity.Student;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider")
public interface FeginProviderClient {

    @GetMapping(value = "/student/findAll")
    public Collection<Student> findAll();

    @GetMapping(value = "/student/index")
    public String index();
}
