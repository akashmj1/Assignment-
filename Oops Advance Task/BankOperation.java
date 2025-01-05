package com.mj.assignment;

class Person{
	public String name;
	public float age;
	
	public Person(String name) {
        this.name = name;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
	
}
class Account{
	private static int accountCounter = 1000;
    private long accNum;
    private Person accowner;
    private double balance;
    private static final double MIN_BALANCE = 500;
	
    public Account(Person accowner, double initialBalance) {
        this.accNum = accountCounter++;
        this.accowner = accowner;
        this.balance = initialBalance;
    }
    
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public Person getAccowner() {
		return accowner;
	}

	public void setAccowner(Person accowner) {
		this.accowner = accowner;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposite(double bal) {
		balance+=bal;
	}
	
	public void withdraw(double bal) {
		balance-=bal;
	}
	public double getBalance() {
		return balance;
	}
	public void displayBalance() {
        System.out.println("Account Number: " + accNum + ", Owner: " + accowner.getName() + ", Balance: " + balance);
    }
	
	
}

class SavingsAccount extends Account{
	final double minBala = 500;
	
	public SavingsAccount(Person owner, double initialBalance) {
        super(owner, initialBalance);
    }
	
	@Override
	public void withdraw(double bal) {
		// TODO Auto-generated method stub
		if(getBalance()-bal > minBala) {
			setBalance(getBalance()-bal);
		}else {
			System.out.println("Your balance is less than minimum balance");
		}
	}
	
}

class CurrentAccount extends Account{
	public double overdraf = 500;
	
	public CurrentAccount(Person owner, double initialBalance, double overdraftLimit) {
        super(owner, initialBalance);
        this.overdraf = overdraftLimit;
    }
	@Override
	public void withdraw(double bal) {
		if(getBalance()-bal > overdraf) {
			System.out.print(true);
			System.out.println("Withdrawal successful. Overdraft limit not exceeded.");
		}else {
			System.out.println("Cannot withdraw. Overdraft limit exceeded.");
		}
	}
}

public class BankOperation {

	public static void main(String[] args) {

		Person smith = new Person("Smith");
        Person kathy = new Person("Kathy");

        Account smithAccount = new Account(smith, 2000);
        Account kathyAccount = new Account(kathy, 3000);

        smithAccount.deposite(2000);

        kathyAccount.withdraw(2000);

        smithAccount.displayBalance();
        kathyAccount.displayBalance();

        SavingsAccount savingsAccount = new SavingsAccount(smith, 2000);
        CurrentAccount currentAccount = new CurrentAccount(kathy, 3000, 1000);

        savingsAccount.withdraw(1600); 

        currentAccount.withdraw(3500); 
    }

}
