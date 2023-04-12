package com.example.mogodbreactive.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Value
@Document(collection = "customers")
public class CustomerModel {
    @Id
    String customerId;
    String companyName;
    String companyEmail;
    String taxId;

    AddressModel billingAddress;

    @JsonCreator
    public CustomerModel(
            String customerId, String companyName, String companyEmail, String taxId, AddressModel billingAddress) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.companyEmail = companyEmail;
        this.taxId = taxId;
        this.billingAddress = billingAddress;
    }
}
