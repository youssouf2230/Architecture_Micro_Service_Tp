package net.youssouf.customersservices;

import net.youssouf.customersservices.entities.Customer;
import net.youssouf.customersservices.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomersServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomersServicesApplication.class, args);
    }
    @Bean
    CommandLineRunner Star(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(new Customer(null,"John", "john@example.com"));
            customerRepository.save(new Customer(null,"Jane", "jane@example.com"));
            customerRepository.save(new Customer(null,"Jack", "jack@example.com"));
            customerRepository.save(new Customer(null,"Jill", "jill@example.com"));
            customerRepository.save(new Customer(null,"Jackson", "jackson@example.com"));
            customerRepository.save(new Customer(null,"Julian", "julian@example.com"));
        };
    }
}
