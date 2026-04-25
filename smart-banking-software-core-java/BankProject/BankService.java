package BankProject;

import BankProject.Account;

public class BankService
{
    private Account[] accounts = new Account[100];
    private int count = 0;

    public void createAccount(int accNo, String name)
    {
        accounts[count++] = new Account(accNo,name);
        System.out.println("Account Created Successfully!");
    }

    public Account getAccount(int accNo)
    {
        for(int i = 0; i< count; i++)
        {
            if(accounts[i].getAccountNumber() == accNo)
            {
                return accounts[i];
            }
        }
        throw new RuntimeException("Account not found");
    }
}