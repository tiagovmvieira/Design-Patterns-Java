package main;

public class FundsCheck {

    private double cashInAccount = 0.00;

    public double getCashInAccount() { return cashInAccount; }

    public void decreaseCashInAccount(double cashWithdrawn){

        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited){

        cashInAccount += cashDeposited;
    }

    public boolean hasEnoughMoney(double cashToWithdrawal){

        if (cashToWithdrawal > getCashInAccount()){

            System.out.println("Error: You don't have enough money");
            System.out.println("Current Balance: " + getCashInAccount());

            return false;
        } else {

            return true;
        }

    }

    public void withdrawalCash(double  cashToWithdrawal){

        decreaseCashInAccount(cashToWithdrawal);
        System.out.println("Withdrawal Complete: Current Balance is " + getCashInAccount() + "€");
    }

    public void makeDeposit(double cashToDeposit){

        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complet: Current Balance is " + getCashInAccount() + "€");
    }

}
