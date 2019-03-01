/* 
Judy Liu
APCS1 pd3
HW10: CMYM
2016-09-27
Make it Rain (Daniel Ju, Haiyao Liu, Judy Liu) 
*/

public class BankAccount{
    //instance variables
    private String AccName; //Account holder name
    private String Pass; //Account Password
    private int PIN; //4-digit PIN
    private int AccNum; //9-digit account number
    private double Balance; //account balance

    private BankAccount(){ //default Constructor
	AccName="No name";
	Pass="None";
	PIN=0000;
	AccNum=000000000;
	Balance=.0;
	}

    private void Setting(String NewAccName, String NewPassword, int NewPIN, int NewAccNum, double NewBal){
	AccName=NewAccName;
	Pass=NewPassword;
	PIN=NewPIN;
	AccNum=NewAccNum;
	Balance=NewBal;
    }
    
    private void deposit(double deAmounts){
	Balance+= deAmounts;
    }

    private void  withdraw(double wiAmounts){
	Balance-= wiAmounts;
    }
    
    public void AccInformation(){ 
	System.out.println("Account holder: "+ AccName );
	System.out.println("Password: "+ Pass);
	System.out.println("PIN: "+ PIN);
	System.out.println("AccountNumber: "+ AccNum);
	System.out.println("Balance: $"+ Balance); 
    }
    public static void main(String[] args){
	BankAccount test = new BankAccount(); //test
	test.Setting("Name","pass",1230,233232432,23.23);
	test.AccInformation();
    }
}
