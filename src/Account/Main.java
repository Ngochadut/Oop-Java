package Account;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        Account id = new Account(206190081,20);
        id.setId(206190081);
        id.setBalance(20);
        id.setDateCreated(date);
        id.setAnnualInteresRate(4.5);
        id.withdraw(10);
        id.deposit(100);

        System.out.println("Account id : " + id.getId());
        System.out.println("Balance : "+ id.getBalance());
        System.out.println("Date Created : " + id.getDateCreated());
        System.out.println("AnnualIntersRate : "+ id.getAnnualInteresRate());
        System.out.println("");
    }
}
