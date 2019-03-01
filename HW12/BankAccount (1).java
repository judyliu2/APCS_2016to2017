/*
APCS1 pd3
HW12: Mo Money Mo Problems
2016-09-30
Make It Rain (Daniel, Haiyao, Judy)
*/

public class BankAccount{
    //instance variables
    private String AccName; //Account holder name
    private String Pass; //Account Password
    private int PIN; //4-digit PIN
    private int AccNum; //9-digit account number
    private double Bal; //account balance

    private BankAccount(){ //default Constructor
	AccName="No name";
	Pass="None";
	PIN=9999;
	AccNum=999999999;
	Bal=.0;
	}

    //Setup methods

    private void setup(String name, String pass){ //setting Account Name and Password
	AccName=name;
	Pass=pass;
    }

    private void setAccNum(int accNum){ //setting Account Number
	if (accNum <= 999999998 && accNum >= 100000000){
	    AccNum=accNum;
	    System.out.println("Your Account Number has been changed to " + accNum);
	}
	else{
	    AccNum=999999999;
	    System.out.println("Sorry, the account Account Number you have entered is not valid. It is not in the interval [100000000,999999998].");
	}
    }

    private void setPIN(int Pin){ //setting PIN
	if (Pin <= 9998 && Pin >= 1000){
	    PIN=Pin;
	    System.out.println("Your PIN has been changed to " + Pin);
	}
	else{
	    AccNum=9999;
	    System.out.println("Sorry, the account PIN you have entered is not valid. It is not in the interval [1000,9998].");
	}
    }

    //Withdraw and Deposit, Not sure why Brown wanted them to return T/F

    private void deposit(double deAmount){
	Bal+= deAmount;
    }

    private boolean withdraw(double wiAmount){
	if (Bal>wiAmount){
	    Bal-=wiAmount;
	    System.out.println("Your balance is now $" + Bal);
	    return true;
	}
	else{
	    System.out.println("You cannot withdraw $"+ wiAmount+". Your account does not contain enough money");
	    return false;
	}
    }

    private boolean authen(int accnum, int pin){ //Checking Authentication
	if (AccNum==accnum && PIN==pin){
	    return true;
	}
	else{
	    return false;
	}
    }

        public void getInfo() {
        System.out.println("Owner: " + name);
        System.out.println("Password: " + pwd);     //this is evidently a very bad thing but printing all info is a good test
        System.out.println("PIN: " + pin);          //similar case for this line
        System.out.println("Account Number: " + accnum);
        System.out.println("Account Balance: " + accbal);
    }

    //Testing some of the methods, not all of them are here
    public static void main(String[] args){
	BankAccount helloe = new BankAccount();
	helloe.setAccNum(99);
	helloe.setPIN(3456);
    }
}
