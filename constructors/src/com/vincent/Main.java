package com.vincent;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        create a new class for a bank account
        create fields for the account number, balance, customer name, email and phone number

        create getters and setters for each filed
        create two additional methods
        1.to allow the customer to deposit funds(this should increment the balance field).
        2. to allow the customer to withdraw funds. this should deduct from the balance field
        but not allow the withdraw to complete if their are insufficient funds.
        you will want to crate various code in the main class(the one crated by intellij)to
        confirm your code is working
        add some system.out.println's in the two methods above as well.

         */

        BankAccount vincent = new BankAccount("525252",500,"vincent","vincent@gmail.com",8651425);



        vincent.depsoit(100000);
        vincent.withdraw(100);
        vincent.depsoit(50);
    }
}
