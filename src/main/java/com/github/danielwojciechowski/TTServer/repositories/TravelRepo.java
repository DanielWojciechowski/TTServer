package com.github.danielwojciechowski.TTServer.repositories;

import com.github.danielwojciechowski.TTServer.datamodel.Travel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TravelRepo extends MongoRepository<Travel, String> {
}
