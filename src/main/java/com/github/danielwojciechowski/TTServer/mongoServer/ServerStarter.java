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
        /*ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
        Travel travel = new Travel();
        travel.setDate(new Date());
        travel.setTrace(new LinkedList<GeoJsonPoint>());
        travel.getTrace().add(new GeoJsonPoint(52.251605, 20.998186));
        travel.getTrace().add(new GeoJsonPoint(52.251202, 20.998266));
        travel.getTrace().add(new GeoJsonPoint(52.250961, 20.998322));
        mongoOperation.save(travel);*/

        SpringApplication.run(ServerStarter.class, args);
    }
}