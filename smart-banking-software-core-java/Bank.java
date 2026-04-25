import BankProject.Account;
import BankProject.BankService;
import java.util.*;

public class Bank
{
    public static void main(String []args)
    {
        Scanner sobj = new Scanner(System.in);
        BankService bank = new BankService();

        while(true)
        {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4. Transactions");
            System.out.println("5. Exit");

            int choice = sobj.nextInt();
            try
            {
                switch(choice)
                {
                    case 1:
                        System.out.println("Enter account no: ");
                        int accNo = sobj.nextInt();
                        sobj.nextLine();
                        System.out.println("Enter your Name: ");
                        String name = sobj.nextLine();
                        bank.createAccount(accNo, name);
                        break;

                    case 2:
                        System.out.println("Enter Account No: ");
                        Account acc1 = bank.getAccount(sobj.nextInt());
                        System.out.println("Enter amount: ");
                        acc1.deposite(sobj.nextDouble());
                        break;
                    case 3:
                        System.out.println("Enter account No: ");
                        Account acc2 = bank.getAccount(sobj.nextInt());
                        System.out.println("Enter amount: ");
                        acc2.withdraw(sobj.nextDouble());
                        break;
                    case 4:
                        System.out.println("Enter Account No: ");
                        Account acc3 = bank.getAccount(sobj.nextInt());
                        acc3.showTransaction();
                        break;
                    case 5:
                        System.exit(0);;
                }
            }
            catch(Exception e)
            {
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
}