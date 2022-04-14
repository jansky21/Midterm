package com.company;

public class Account
{
    String Name;
    String Surname;
    long Phone_number;
    double Balance;
    double balance2;
    Account()
    {
        this.Name = "Stefanie";
        this.Surname = "Borromeo";
        this.Phone_number = 1225252;
    }
    public void setBalance(double amount)
    {
        this.Balance = amount;
    }
    public double getBalance()
    {
        return Balance;
    }
    public Account(double balance) {
        balance2 = balance;
        Balance = balance;
    }
    public void display() {
    }
    public void deposit(double deposit) {
    }
}