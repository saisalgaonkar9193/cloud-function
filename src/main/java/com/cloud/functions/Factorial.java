package com.cloud.functions;

import org.springframework.stereotype.Component;

import java.util.function.Function;
import java.util.stream.IntStream;

@Component
public class Factorial implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return IntStream.rangeClosed(1, integer).reduce(1, (a, b) -> a * b);
    }
}
