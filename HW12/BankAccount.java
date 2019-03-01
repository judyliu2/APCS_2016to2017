//Daniel Ju, Group Make it Rain, (Daniel, Haiyao, Judy)
//APCS1 pd3
//HW12 -- Mo Money Mo Problems
//2016-10-03

public class BankAccount {
    private String Name;   //Account holder full name
    private String PWord;  //Account password
    private int PIN;  //4-digit PIN
    private int AccNum; //9-digit account number
    private double Balance;  //Account balance
    public BankAccount() {  //Default constructor to set everything to 0
	Balance = 0.0;
	PWord = "";
	PIN = 0000;
	AccNum = 123456789;
	Name = "";
    }
    public BankAccount(String name, String pword, int pin, int accnum, double balance) { //loaded constructor for setting everything
	Balance = balance;
	PWord = pword;
	if (999 < pin && pin < 9999) { //setting range for PIN
	    PIN = pin;
	}
	else {
	    PIN = 9999;
	    System.out.println ("Invalid PIN. PIN must be between 1000 and 9998. Automatically set to 9999");
	}
	if (99999999 < accnum && accnum < 999999999){ //Setting range for account number
	    AccNum = accnum;
	}
	else {
	    AccNum = 999999999;
	    System.out.println ("Invalid account number. It must be a 9 digit number that's not 999999999. Automatically set to 999999999.");
	}
	Name = name;
    }
    public void PrintAccInfo() { // Can be later modified to take a password / PIN and then only printing everything except password and PIN but that would require if statements.
	System.out.println("Owner: " + Name);
        System.out.println("Password: " + PWord);    
        System.out.println("PIN: " + PIN);          
        System.out.println("Account Number: " + AccNum);
        System.out.println("Account Balance: " + Balance);
    }
    public void Deposit(double amount) { // If statements can be added here to check with the password as well
	Balance += amount;
    }
    public void Withdrawl(double amount) { //Ditto as deposit
	if (Balance <= 0 || Balance < amount || amount < 0) {
	    System.out.println ("Cannot withdraw because amount exceeds balance");
	}
	else {
	    Balance -= amount;
	}

    }
    public boolean  Authenticate(int pin, int accnum) {
	if (pin == PIN && accnum == AccNum) {
	    return true;
	}
	else {
	    return false;
	}
    }
    public static void main(String[] args) {
	//BankAccount test = new BankAccount("Daniel", "password", 1111, 123123123, 4.5);  //Making a test version of BankAccount for testing, comment out for now. 
	//BankAccount trial = new BankAccount("Max", "blah", 1, 123, 42000);
	//test.PrintAccInfo();
	//trial.PrintAccInfo();
	//test.Deposit(500);
	//test.PrintAccInfo();
	//test.Withdrawl(10);
	//test.PrintAccInfo();
	//System.out.println(test.Authenticate(1111,123123123));
    }
}
