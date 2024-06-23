package Lab_12.Package ATM and Bank;

package atm;
import bank. AccountDetails; 
public class DetailsAccount {
    public static void main(String[] args) {
    	 AccountDetails account = new  AccountDetails("SBI", 123456789,5522);
        account.Bankname(); 
        account.Accountnumber();
        account.Ifsccode();
    }
}

