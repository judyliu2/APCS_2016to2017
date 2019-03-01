/* Judy Liu
APCS1 pd3
HW08 -- On the Origins of a BigSib
2016-09-23 */

public class BigSib{
    String name;
    String msg;
    public BigSib(){ // Default Constructor
	msg="no msg";
    }
    public BigSib(String newMsg){ // Overloaded Constructor
	msg=newMsg;
    }
    public String greet(String newname){
	name=newname;
	return msg + ' ' + name;
    }
}
