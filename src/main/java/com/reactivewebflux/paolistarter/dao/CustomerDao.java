package com.reactivewebflux.paolistarter.dao;
import com.reactivewebflux.paolistarter.dto.Customer;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;


@Component
public class CustomerDao {

    public Flux<Customer> getCustomers(){
        Flux<Customer> map = Flux.range(1, 50)
                .doOnNext(i -> System.out.println("processing count: " + i))
                .map(i -> new Customer(i, "customer" + i));
        return map;
    }

}
