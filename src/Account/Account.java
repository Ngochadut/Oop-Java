package Account;

import java.util.Scanner;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInteresRate;
    private Date dateCreated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInteresRate() {
        return annualInteresRate;
    }

    public void setAnnualInteresRate(double annualInteresRate) {
        this.annualInteresRate = annualInteresRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

   Account(int id, double balance){
       this.id = id;
       this.balance = balance;
   }

   public double monthlyInterestRate(){
        return (annualInteresRate/100)/12;
   }

   public double getMonthlyInterestRate(){
        return  balance = balance*monthlyInterestRate()+balance;
   }

   public double  withdraw(int moneyWithdraw){
        return balance = getMonthlyInterestRate() - moneyWithdraw;
   }

   public double deposit(int moneyDeposit){
        return balance = balance + moneyDeposit;
   }

}
