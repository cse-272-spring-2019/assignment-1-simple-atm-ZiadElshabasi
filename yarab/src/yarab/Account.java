package yarab;


public class Account{

private double balance=0.0;
private String id=new String("0000");

public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}

public void setBalance(double balance) {System.out.println("your deposit equals:"+balance);
	this.balance = balance;
}


public void doDeposit(double deposit) {
	this.balance=this.balance+deposit;
	System.out.println("your deposit equals:"+balance);
	AlertBox.display("succes","your deposit has done Successfully");

}
public void withdraw(double withdraw) {
	if (withdraw>balance) {
		AlertBox.display("Error","insuficient balance");
	}
	else if (withdraw==0) {AlertBox.display("Error","please enter a correct number");}
	else {
		this.balance=this.balance-withdraw;
		AlertBox.display("succes","your withdraw has done Successfully check your balance please");
}}

public double getBalance() {

	return this.balance;
}
}

