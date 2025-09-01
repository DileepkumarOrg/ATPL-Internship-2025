package com.Assignment2;

import java.util.Optional;
import java.util.function.Supplier;

public class LazyConfigLoader {
    public static void main(String[] args) {
        
        Optional<String> configValue = Optional.empty(); 
        Supplier<String> loadConfigValue = () -> {
            System.out.println("Loading config...");
            return "DefaultConfigValue";
        };

        String finalConfig = configValue.orElseGet(loadConfigValue);

        System.out.println("Final Config: " + finalConfig);
    }
}
