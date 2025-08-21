package net.youssouf.customersservices.config;

import lombok.AllArgsConstructor;
import net.youssouf.customersservices.web.CustomerSOAPService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AllArgsConstructor
public class CxfConfig {
    private Bus bus;
    private CustomerSOAPService customerSOAPService;

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, customerSOAPService);
        endpoint.publish("/CustomerService");
        return endpoint;
    }
}
