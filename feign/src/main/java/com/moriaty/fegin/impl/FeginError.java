package com.moriaty.fegin.impl;

import com.moriaty.entity.Student;
import com.moriaty.fegin.FeginProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeginError implements FeginProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
