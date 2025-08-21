package net.youssouf.customersservices.web;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import lombok.AllArgsConstructor;
import net.youssouf.customersservices.dtos.CustomerRequest;
import net.youssouf.customersservices.entities.Customer;
import net.youssouf.customersservices.mappers.CustomerMapper;
import net.youssouf.customersservices.repositories.CustomerRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@AllArgsConstructor
@WebService(serviceName = "CustomerWS")
public class CustomerSOAPService {
    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @WebMethod
    public List<Customer> customerList() {
        return customerRepository.findAll();
    }

    @WebMethod
    public Customer customerById(@WebParam(name = "id") Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @WebMethod
    public Customer saveCustomer(@WebParam(name = "customer") CustomerRequest customerRequest) {

        return customerRepository.save(customerMapper.from(customerRequest));
    }
}
