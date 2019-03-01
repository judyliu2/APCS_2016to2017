
//APCS1 p3
//HW13: Outsourcing
//2016-10-5
//Team: Make It Rain
//Daniel Ju, Judy Liu, Haiyao Liu

public class Teller {
    public static void main(String[] args) {
        
        //constructor test cases----------------------------
        
        //default: no parameters passed
        //expect: no error
        //result: no error
        BankAccount def = new BankAccount();
        
        //overloaded 1: parameters passed in correct order with correct datatypes
        //expect: no error
        //result: no error
        BankAccount ov1 = new BankAccount("test1", "noerrorhere", 1111);
        
        //overloaded 2: invalid pin number
        //expect: invalid pin custom error message
        //result: cannot put double for AccountNum or cannot compile
        BankAccount ov2 = new BankAccount("test2", "fakepinerror", 2);
        
        //print test 1: confirm variable assignments and test toString() overwrite
        //expect: no error, matching variables from above with correct defaults and error catch id (pin)
        //result: no error
        System.out.println(def);
        System.out.println(ov1);
        System.out.println(ov2);
        
        //variable reassignment test cases------------------
        
        //all instance vars with valid parameters
        //expect: no error, success messages from deposit/withdraw
        //result: no error
        def.setName("assign1.0");
        def.setPass("assign1.1");
        def.setPIN(2112);
        def.setAccNumber(211300000);
        def.depositMuns(34.54);
        def.withdrawMuns(10.00);
        
        //withdraw test
        //expect: custom error message "Not enough money!"
        //result: "ERROR: Not enough money!:
        def.withdrawMuns(24.55);
        
        //set account number test
        //expect: custom error message invalid number not in range, defaulted to 999999999
        //result: What is expected
        def.setAccNumber(0);
        
        //print test 2: confirm variable resassignments and test toString() overwrite
        //expect: correct values according to assignments from above
        //result: correct values
        System.out.println(def);
    
        //auth method test----------------------------------
        
        //test case 1: valid credentials
        //expect: true
        //result: true
        System.out.println(def.authenticate(999999999,"assign1.1"));
        
        //test case 2: invalid credentials
        //expect: false
        //result: false
        System.out.println(def.authenticate(000000000,"haxors2.71828"));
    }
}
