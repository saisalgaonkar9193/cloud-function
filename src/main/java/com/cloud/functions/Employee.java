package com.cloud.functions;

import org.springframework.stereotype.Component;

import java.util.function.Supplier;

@Component
public class Employee implements Supplier<String> {
    @Override
    public String get() {
        return "Employee";
    }
}
