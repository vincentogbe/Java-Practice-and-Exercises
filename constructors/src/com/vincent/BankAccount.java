package com.vincent;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class BankAccount {

    private String AccountNumber;
    private int Balance;
    private String coustomer;
    private String email;
    private double phoneNumber;


    public BankAccount(){
        System.out.println("empty constructor");
    }
    public BankAccount(String AccountNumber, int Balance, String coustomer ,String email,double phoneNumber ){

        this.Balance = Balance;
        this.AccountNumber = AccountNumber;
        this.coustomer = coustomer;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }



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

    public void setAccountNumber(String accountNumber){
        this.AccountNumber = accountNumber;
    }

    public String getAccountNumber() {
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

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getPhoneNumber() {
        return this.phoneNumber;
    }
}

