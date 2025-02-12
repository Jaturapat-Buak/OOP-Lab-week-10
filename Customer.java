/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.ArrayList;
public class Customer {

    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount;


    public Customer(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
       acct = new ArrayList();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public void setLastName(String lastName) {
            this.lastName = lastName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void addAccount(Account ac) {
        acct.add(ac);
    }
    
    public Account getAccount(int index){
        return acct.get(index);
    }
    
    public int getNumOfAccount() {
        return acct.size();
    }
    
    @Override
    public String toString() {
        return firstName + " " + lastName + " has " + numOfAccount + " account(s).";
    }
}
