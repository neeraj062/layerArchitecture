package dao;

import entities.Customer;
import exceptions.CustomerNotFoundException;

import java.util.*;

public class CustomerDaoImpl implements ICustomerDao {
    private Map<String, Customer> store = new HashMap<>();

    @Override
    public void addCustomer(Customer e) {
        store.put(e.getId(), e);
    }

    @Override
    public Customer findCustomerById(String id) {
        Customer e = store.get(id);
        if (e == null) {
            throw new CustomerNotFoundException("employee not found for id=" + id);
        }
        return e;
    }

    @Override
    public Set<Customer> allCustomers() {
        Collection<Customer> employees = store.values();
        Set<Customer> CustomerSet = new HashSet<>(employees);
        return CustomerSet;
    }
}
