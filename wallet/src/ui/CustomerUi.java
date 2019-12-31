package ui;


import dao.CustomerDaoImpl;
import entities.Customer;
import service.CustomerServiceImpl;
import service.ICustomerService;

import java.util.Collection;
import java.util.Set;

public class CustomerUi {
    private ICustomerService service = new CustomerServiceImpl(new CustomerDaoImpl());

    public static void main(String[] args) {
    	CustomerUi ui = new CustomerUi();
        ui.runUi();
    }

    public void runUi() {
        try {
        	Customer e1 = new Customer("1234", "Aman",2000);
        	Customer e2 = new Customer("2344", "Vishal",3000);
            service.addCustomer(e1);
            service.addCustomer(e2);
            Customer fetched1 = service.findCustomerById("1234");
            Customer fetched2 = service.findCustomerById("2344");
            
            e1.addBalance(500);
    		e2.addBalance(1000);
    		e1.transferMoney(e2, 1900);
    		
    		
    		//service.put(e2.getId(),e2);
            
            System.out.println(fetched1.getName());
            System.out.println(fetched2.getName());
            //System.out.println("********printing all customer details****");
            Set<Customer> customers = service.allCustomers();
            print(customers);
        }catch (Throwable e){
            e.printStackTrace();
            System.out.println("something went wrong");
        }
    }

    void print(Collection<Customer>customers){
    	System.out.println("1900 is transferred from customer1 to customer2  and remaining balance is shown below :");
        for (Customer e:customers){
            System.out.println(e.getName() +" "+e.getBalance());
        }
    }
}
