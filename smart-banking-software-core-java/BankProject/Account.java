package BankProject;

public class Account
{
    private  int accountNumber;
    private String name;
    private double balance;

    private String[] transactions = new String[100];
    private int transactionCount = 0;

    public Account(int accountNumber,String name)
    {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0.0;
    }

    public void deposite(double amount)
    {
        balance = balance + amount;
        transactions[transactionCount++] = "Deposited: "+amount;
    }

    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            throw new RuntimeException("Insufficient Balance");
        }
        balance = balance - amount;
        transactions[transactionCount++] = "Withdraw: "+amount;
    }

    public void showTransaction()
    {
        for(int i = 0; i < transactionCount; i++)
        {
            System.out.println(transactions[i]);
        }
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

}