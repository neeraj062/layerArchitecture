package service;

import dao.ICustomerDao;
import entities.Customer;
import exceptions.IncorrectIdException;

import java.util.Set;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerDao dao;

    public CustomerServiceImpl(ICustomerDao dao) {
        this.dao = dao;
    }

    @Override
    public void addCustomer(Customer e) {
        dao.addCustomer(e);
    }

    @Override
    public Customer findCustomerById(String id) {
        if (id ==null) {
            throw new IncorrectIdException("id is incorrect");
        }
        Customer e = dao.findCustomerById(id);
        return e;
    }

    @Override
    public Set<Customer> allCustomers() {
        Set<Customer> customers = dao.allCustomers();
        return customers;
    }
}
