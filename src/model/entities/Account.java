package model.entities;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance = 0.0;

    public Account() {
    }

    public Account(String holder) {
        this.holder = holder;
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void depositBalance(Double balance) {
        this.balance += balance;
    }

    public void withdrawBalance(Double balance) {
        this.balance -= balance + 5.0;
    }

}
