package com.exventure.training.swaggerproject1.Repositories;

import com.exventure.training.swaggerproject1.Repositories.Entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
