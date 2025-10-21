package application;

import model.entities.Account;
import model.entities.BusinessAccount;
import model.entities.SavingsAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Account acc00 = new Account(1001, "Alex", 1000.0);
       acc00.withdrawBalance(200.0);
        System.out.println(acc00.getBalance());

       Account sav00 = new SavingsAccount(1002, "Maria", 1000.0, 0.1);
       sav00.withdrawBalance(200.0);
        System.out.println(sav00.getBalance());

       Account bcc00 = new BusinessAccount(1003, "José", 1000.0, 500.0);
       bcc00.withdrawBalance(200.0);
        System.out.println(bcc00.getBalance());

        Account x = new Account(1001, "Alex", 1000.0);
        Account y = new SavingsAccount(1002, "Maria", 1000.0, 0.1);

    }
}