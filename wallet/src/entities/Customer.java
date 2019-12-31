package entities;

import wallet.entity.CustomerWallet;

public class Customer {
	
	private String id;
	private String name;
	private double balance;
	public Customer(String id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void addBalance(double balance) {
		this.balance += balance;
	}

	public CustomerWallet(String mobileNo, String name, double balance) {
		this.id = mobileNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void transferMoney(Customer acc, double amt) {
		if (this.balance >= amt) {
			acc.addBalance(amt);
			balance = balance - amt;
		}
	}
	
	@Override
    public String toString() {
        String display=id+" "+name +" "+balance;
        return display;
    }

    @Override
    public boolean equals(Object obj) {
        
        if(obj==this){
            return true;
        }

        if(obj ==null|| !(obj instanceof Customer)){
            return false;
        }
       
        Customer e=(Customer)obj;
        return e.id.equals(this.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
	

}
