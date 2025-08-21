package net.youssouf.customersservices.mappers;

import net.youssouf.customersservices.dtos.CustomerRequest;
import net.youssouf.customersservices.entities.Customer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    private final ModelMapper modelMapper = new ModelMapper();

    public Customer from(CustomerRequest customerRequest){
        //Customer customer = new Customer();
        //customer.setName(customerRequest.name());
        //customer.setEmail(customerRequest.email());
        return modelMapper.map(customerRequest, Customer.class);
    }
}
