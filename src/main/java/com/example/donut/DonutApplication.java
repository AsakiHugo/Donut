package com.example.donut;

import com.example.donut.dao.ProductDao;
import com.example.donut.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@RequiredArgsConstructor
public class DonutApplication {
    private final ProductDao productDao;

    public static void main(String[] args) {
        SpringApplication.run(DonutApplication.class, args);
    }

    @Bean
    @Profile("dev")
    public ApplicationRunner runner() {
        return r -> {
            Product product1 = new Product("Blissful Berry Burst", 2500, 50,
                    "https://source.unsplash.com/400x300/?donut");
            Product product2 = new Product("Caramel Carnival Delight", 4500, 50,
                    "https://source.unsplash.com/400x300/?donut");
            Product product3 = new Product("Heavenly Hazelnut Dream", 2500, 50,
                    "https://source.unsplash.com/400x300/?donut");
            Product product4 = new Product("Zesty Citrus Splash", 3500, 50,
                    "https://source.unsplash.com/400x300/?donut");
            Product product5 = new Product("Velvet Vanilla Euphoria", 4500, 50,
                    "https://source.unsplash.com/400x300/?donut");

            productDao.save(product1);
            productDao.save(product2);
            productDao.save(product3);
            productDao.save(product4);
            productDao.save(product5);
        };
    }
}
