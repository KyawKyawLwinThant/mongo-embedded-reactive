package com.example.mogodbreactive.util;

import com.example.mogodbreactive.model.AddressModel;
import com.example.mogodbreactive.model.CustomerModel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

@Component
public class TemplateDatabaseLoader {
    //@Bean
    CommandLineRunner initialize(MongoOperations mongo){
        return args ->{
            mongo.save(new CustomerModel(null,"SOLT",
                    "solt@gmail.com","S13",
                    new AddressModel("line1","11111","Ygn")));
            mongo.save(new CustomerModel(null,"MoonPig",
                    "moonpig@gmail.com","S15",
                    new AddressModel("line2","22222","Mdy")));
            mongo.save(new CustomerModel(null,"EagleDragon",
                    "eagle@gmail.com","S16",
                    new AddressModel("line3","33333","Ygn")));
        };
    }
}
