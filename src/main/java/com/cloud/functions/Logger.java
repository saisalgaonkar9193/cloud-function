package com.cloud.functions;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;
@Component
public class Logger implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
