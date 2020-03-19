package com.cloud.functions;

import java.util.function.Function;
import java.util.stream.IntStream;

public class Factorial implements Function<Integer, Integer> {

    @Override
    public Integer apply(Integer integer) {
        return IntStream.rangeClosed(1, integer).reduce(1, (a, b) -> a * b);
    }
}
