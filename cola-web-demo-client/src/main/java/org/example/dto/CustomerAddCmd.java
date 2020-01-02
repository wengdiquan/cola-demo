package org.example.dto;

import com.alibaba.cola.dto.Command;
import org.example.dto.domainmodel.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private Customer customer;

}
