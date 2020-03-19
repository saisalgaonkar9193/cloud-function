package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class TestCloudFunction {
    public static void main(String[] args) {
        SpringApplication.run(TestCloudFunction.class, args);
    }

    @Bean
    public Function<String,List<String>> words(){
        return (words)-> Stream.of(words.split(",")).collect(Collectors.toList());
    }
}
