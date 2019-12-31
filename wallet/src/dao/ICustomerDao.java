package dao;

import java.util.Set;

import entities.Customer;

public interface ICustomerDao {
    void addCustomer(Customer e);

    Customer findCustomerById(String id);

    Set<Customer> allCustomers();
}
