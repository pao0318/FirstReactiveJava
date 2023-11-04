package com.reactivewebflux.paolistarter.service;

import com.reactivewebflux.paolistarter.dao.CustomerDao;
import com.reactivewebflux.paolistarter.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class CustomerService {

    @Autowired
    CustomerDao customerDao;

    public Flux<Customer> loadAllCustomersStream(){
        return customerDao.getCustomers();

    }
}
