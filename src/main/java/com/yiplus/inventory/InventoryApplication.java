package com.yiplus.inventory;

import com.Fuckyou;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SpringBootApplication
public class InventoryApplication {

    public static void main(String[] args) {

        SpringApplication.run(InventoryApplication.class, args);
    }

}
