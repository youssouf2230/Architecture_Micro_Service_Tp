package net.youssouf.customersservices.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.youssouf.customersservices.entities.Customer;
import org.springframework.graphql.data.method.annotation.Argument;

@Data @Builder @NoArgsConstructor
@AllArgsConstructor
public class  CustomerRequest{
    private String name;
    private String email;
}
