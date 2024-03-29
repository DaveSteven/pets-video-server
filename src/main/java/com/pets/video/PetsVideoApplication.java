package com.pets.video;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.pets.video.dao"})
@ComponentScan(basePackages = {"com.pets.video", "org.n3r.idworker"})
public class PetsVideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetsVideoApplication.class, args);
    }

}
