package com.cloud.functions;

import java.util.function.Consumer;

public class Logger implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
