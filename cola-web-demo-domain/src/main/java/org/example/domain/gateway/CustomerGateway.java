package org.example.domain.gateway;

import org.example.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
