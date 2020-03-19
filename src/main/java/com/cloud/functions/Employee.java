package com.cloud.functions;

import java.util.function.Supplier;

public class Employee implements Supplier<String> {
    @Override
    public String get() {
        System.out.println("Hello");
//        return Stream.of("Saish");
        return "Saish";
    }
}
