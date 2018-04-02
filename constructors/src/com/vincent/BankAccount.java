package com.vincent;

public class BankAccount {

    private int AccountNumber;
    private int Balance;
    private String coustomer;
    private String email;
    private int phoneNumber;



    public void depsoit(int depositaccount){
        this.Balance+= depositaccount;

        System.out.println("you deposited "+ depositaccount+ " into your account. your new balance "+ this.Balance);


    }
    public void withdraw(int withdrawMoney){
        if(withdrawMoney <= this.Balance){

            this.Balance -= withdrawMoney;

            System.out.println("withdraw of "+ withdrawMoney + " processed. remaining balance = "+ this.Balance);

        }
        else{
            System.out.println("only "+this.Balance+" available funds. withdraw not processed");
        }
    }

    public void setAccountNumber(int accountNumber){
        this.AccountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return this.AccountNumber;
    }

    public void setBalance(int balance) {
        this.Balance = balance;
    }

    public int getBalance() {
        return this.Balance;
    }

    public void setCoustomer(String coustomer) {
        this.coustomer = coustomer;
    }

    public String getCoustomer() {
        return this.coustomer;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }
}

