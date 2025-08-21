package net.youssouf.customersservices.web;

import lombok.AllArgsConstructor;
import net.youssouf.customersservices.dtos.CustomerRequest;
import net.youssouf.customersservices.entities.Customer;
import net.youssouf.customersservices.mappers.CustomerMapper;
import net.youssouf.customersservices.repositories.CustomerRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerGraphQLService {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @QueryMapping
    public List<Customer> allCustomers() {
        return customerRepository.findAll();
    }
    @QueryMapping
    public Customer customerById(@Argument Long id) {
        Customer customer =  customerRepository.findById(id).orElse(null);
        if (customer == null) throw new RuntimeException("Customer not found");
        return customer;

    }

    @MutationMapping
    public Customer saveCustomer(@Argument CustomerRequest customer) {
        Customer c = customerMapper.from(customer);
        return customerRepository.save(c);
    }

}
