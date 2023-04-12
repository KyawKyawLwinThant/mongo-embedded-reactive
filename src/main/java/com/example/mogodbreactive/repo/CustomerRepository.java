package com.example.mogodbreactive.repo;

import com.example.mogodbreactive.model.CustomerModel;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CustomerRepository extends
        ReactiveMongoRepository<CustomerModel,String> {
}
