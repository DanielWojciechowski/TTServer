package com.github.danielwojciechowski.TTServer.mongoServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.github.danielwojciechowski.TTServer")
@EnableMongoRepositories("com.github.danielwojciechowski.TTServer.repositories")
public class ServerStarter {
    public static void main(String[] args) {
        SpringApplication.run(ServerStarter.class, args);
    }
}
