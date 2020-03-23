package com.cloud.functions;

import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class Reverse implements Function<String, String> {
    @Override
    public String apply(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
