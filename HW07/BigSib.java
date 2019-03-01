/*Judy Liu
APCS1 pd3
HW07 On BigSib Individuality and the Elimination of Radio Fuzz
2016-09-22*/

public class BigSib{
    private String helloMsg; //System.out.println( richard.helloMsg ); Will work when the protection is public

    public void setHelloMsg(String NewMsg){
	helloMsg = NewMsg;
    }
    public String greet(String nickname){
	helloMsg +=" ";
	helloMsg += nickname;
	return helloMsg;
    }
}
