package com.example.mogodbreactive.controller;


import com.example.mogodbreactive.model.CustomerModel;
import com.example.mogodbreactive.service.CustomerService;
import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

    private final CustomerService customerService;

    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(value = "/customers",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    Publisher<CustomerModel> getAllCustomers(){
        return customerService.findAllCustomers();
    }












}
