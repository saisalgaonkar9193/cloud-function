package com.cloud.functions;

import org.springframework.stereotype.Component;

import java.util.function.Supplier;
@Component
public class Greet implements Supplier<String> {

    @Override
    public String get() {
        return "SAISH";
    }
}
