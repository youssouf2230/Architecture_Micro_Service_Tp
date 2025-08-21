package net.youssouf.customersservices.repositories;

import net.youssouf.customersservices.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

