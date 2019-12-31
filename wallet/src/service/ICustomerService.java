package service;

import entities.Customer;

import java.util.Set;

public interface ICustomerService {
    void addCustomer(Customer e);

    Customer findCustomerById(String id);

    Set<Customer> allCustomers();
}
