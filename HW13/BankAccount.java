//Team Tsk Tsk: Mansour Elsharawy, Henry Zheng, Ricky Chen
//APCS1 pd3
//HW12 -- Mo Money Mo Problems
//2016-10-04

//Reviewing Team: Team Make it Rain (Daniel Ju, Judy Liu, Haiyao Liu)

//Edits:
//inserted or edited comments preceded by # 
//additional whitespace added to improve readability and contrast between comments and code

public class BankAccount {
	
    //Declares variables
    private String holderName;		//# account owner's name:		str
    private String password;		//# account password:			str
    private int PIN;				//#	4 digit pin:				int, short requires 'typecasting' or extra declaration line
    private int accNumber;			//# 9 digit account number:		int, ranging from 1000-9998, 999 reserved
    private double accBalance;		//# account balance:			dbl, used to avoid loss of precision, $ amt may not be integer or small enough for float primitive
    
    //Main method with test cases
    public static void main(String[] args) {
    	
		//# Default constructor test, no parameters accepted
		BankAccount citibank = new BankAccount();
		
		//# Overloaded constructor tests, pass: String owner's name, String account password, int pin#
		//# test case 1: invalid pin
		BankAccount capitalOne = new BankAccount("Holden Higgins","hsquared",2);
		
		//Prints out starting information
		System.out.println(citibank);
		System.out.println(capitalOne);
		
		//Customizes citibank with some sweet mutator methods
		//# changes owner name, password, pin#, and account number, respectively
		citibank.setName("Henry the Scrub");
		citibank.setPass("scrublord10100");
		citibank.setPIN(1010);
		citibank.setAccNumber(123456789);
		
		//Let's print citibank to make sure our changes went through
		//# test case for toString() overwrite
		System.out.println(citibank);
		
		//Testing deposits
		//#additional mutator test for adding to double accBalance
		capitalOne.depositMuns(3.27);
		
		//Testing withdrawals that work and don't work
		
		//# test case 1: expect fail & custom error & false
		citibank.withdrawMuns(1776.74);
		//# test case 2: expect success & success message & true
		capitalOne.withdrawMuns(1.00);
		
		//Print new info
		
		//# test case 2/3 for toString() overwrite
		System.out.println(citibank);
		System.out.println(capitalOne);
		
		//Authentication success and failure
		
		//# test case 1: expect true
		System.out.println(citibank.authenticate(123456789,"scrublord10100"));
		
		//# test case 2: expect false
		System.out.println(citibank.authenticate(12345679,"scrublord10100"));
	
    }

    
    //Default constructor with no parameters
    public BankAccount(){
	holderName = "Unnamed";
	password = "password";
	PIN = 1000;
	accNumber = 100000000;
	accBalance = 0.00;
    }

    
    //Constructor that sets Holder Name, Password, and PIN
    public BankAccount(String username,String pass,int pinnum){
	holderName = username;
	password = pass;
	setPIN(pinnum);
	accNumber = 100000000;
	accBalance = 0.00;

    }

    
    //All of the mutator  methods
    
    //# set account owner name to new str
    public void setName(String username) {
	holderName = username;
    }

	//# set password to new str
    public void setPass(String pass) {
	password = pass;
    }

	//# set pin to new 999<int<9999 
    public void setPIN(int pinnum) {
	if (pinnum <= 9998 && pinnum >= 1000) {
	       	PIN = pinnum;
	    }
	
	else {
	    PIN = 9999;
	    
	    //# custom error message
	    System.out.println("PIN must be an integer between 1000 and 9998. PIN has been set to 9999.");
	}
    }

	//# set acc# to new 99,999,999<int<999,999,999
    public void setAccNumber(int accnum) {
	if (accnum <= 999999998 && accnum >= 100000000){
	    accNumber = accnum;
    }
	else {
	    accNumber = 999999999;
	    
	    //# custom error message
	    System.out.println("Account number  must be an integer between 100000000 and 999999998. Account number has been set to 999999999.");
	}
    }

    
    //Keeping the following method private as it's kind of unnecessary for someone to change, but could be of use.
    
    //# ...?
    
    private void setBalance(double balance) {
	accBalance = balance;
    }

    
    //Prints out all of the info of an account (toString redefined YAY!)
    
    //# overwrite of toString(), concatenates all instance vars with descriptions preceding :
    public String toString(){
	String retStr;
	retStr = "\nHolder's Name: " + holderName + "\n";
	retStr += "Password: " + password + "\n";
	retStr += "PIN Number: " + PIN + "\n";
	retStr += "Account Number: "  + accNumber + "\n";
	retStr += "Current Balance: " + accBalance + "\n\n";
	return retStr;		
    }

    // Deposit money method
    
    //# adds passed double to accBalance. this belongs under "all the mutator methods" (the keyword being "all")
    public void depositMuns(double depositAmnt){
	accBalance += depositAmnt;
	System.out.println(holderName + ", your new account balance is: " + accBalance);	     
    }

    //Withdraw money method
    
    //# subtracts passed double from accBalance unless ! encounter error "Not enough money!" 
    public boolean withdrawMuns(double withdrawAmnt){
	if (withdrawAmnt <= accBalance) {
	    	accBalance -= withdrawAmnt;
	    	
	    	//# custom success message
        	System.out.println(holderName + ", your new account balance is: " + accBalance);
		return true;

	}
	else {
		//# custom error message
	    System.out.println("ERROR: Not enough money!");
	    return false;
	}
    }


    //Authenticate method
    
    //# accepts parameters: int acc# and Str pass, ^compare with instance acc# and password, respectively
    public boolean authenticate(int testNumber, String testPass){
	return (accNumber == testNumber && password == testPass);
    }
   
}