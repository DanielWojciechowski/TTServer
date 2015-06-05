package com.github.danielwojciechowski.TTServer.repositories;

import com.github.danielwojciechowski.TTServer.datamodel.Travel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TravelRepo extends MongoRepository<Travel, String> {

/*    default void m(@Param("id") String id){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MongoConfig.class);
        MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
        Query query6 = new Query();
        query6.addCriteria(Criteria.where("id").is("appleF"));

        Update update6 = new Update();
        update6.set("age", 101);
        update6.set("ic", 1111);

        //FindAndModifyOptions().returnNew(true) = newly updated document
        //FindAndModifyOptions().returnNew(false) = old document (not update yet)
        Travel userTest6 = mongoOperation.findAndModify(
                query6, update6,
                new FindAndModifyOptions().returnNew(true), Travel.class);
    }*/
}
