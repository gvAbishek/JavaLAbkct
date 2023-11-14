
import java.util.Scanner;

class Account {
    String accountName;
    String accountNumber;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Name: ");
        accountName = scanner.nextLine();
        System.out.println("Enter Account Number: ");
        accountNumber = scanner.nextLine();
    }
}

class SavingsAccount extends Account {
    Scanner Scan2=new Scanner(System.in);
    double balance,amount;

    public void deposit() {
        System.out.println("Enter the amount to be deposit: ");
        amount=Scan2.nextDouble();
        balance += amount;
        System.out.println("Deposit of " + amount + " successful.");
    }

    public void withdraw() {
        Scanner Scan3=new Scanner(System.in);
        System.out.println("Enter the amount to be deposit: ");
        amount=Scan3.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void display() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class CurrentAccount extends Account {
    double balance,amount;

    public void deposit() {
        Scanner Scan4=new Scanner(System.in);
        System.out.println("Enter the amount to be deposit: ");
        amount=Scan4.nextDouble();
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void withdraw() {
        Scanner Scan5=new Scanner(System.in);
        System.out.println("Enter the amount to be deposit: ");
        amount=Scan5.nextDouble();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    public void display() {
        System.out.println("Current Account Details:");
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of savings accounts: ");
        int numSavingsAccounts = scanner.nextInt();
        SavingsAccount[] savingsAccounts = new SavingsAccount[numSavingsAccounts];

        for (int i = 0; i < numSavingsAccounts; i++) {
            savingsAccounts[i] = new SavingsAccount();
            savingsAccounts[i].getData();
            System.out.println("Enter initial balance for Savings Account " + (i + 1) + ": ");
            savingsAccounts[i].balance = scanner.nextDouble();
        }

        System.out.println("Enter the number of current accounts: ");
        int numCurrentAccounts = scanner.nextInt();
        CurrentAccount[] currentAccounts = new CurrentAccount[numCurrentAccounts];

        for (int i = 0; i < numCurrentAccounts; i++) {
            currentAccounts[i] = new CurrentAccount();
            currentAccounts[i].getData();
            System.out.println("Enter initial balance for Current Account " + (i + 1) + ": ");
            currentAccounts[i].balance = scanner.nextDouble();
        }
        int choice;


        do {System.out.println("_________Dashboard________");
            System.out.println("1.sb deposit");
            System.out.println("2. sb withdraw");
            System.out.println("3. sb balance");
            System.out.println("4.ca deposit");
            System.out.println("5. ca withdraw");
            System.out.println("6. ca balance");
            System.out.println("7.exit");
            System.out.println("Enter your choice: ");
            choice =scanner.nextInt();

            switch(choice){

                case 1:{
                    System.out.println("Enter the Account num: ");
                    int b=scanner.nextInt();
                    savingsAccounts[b-1].deposit();
                    break;
                }
                case 2:{
                    System.out.println("Enter the Account num: ");
                    int b=scanner.nextInt();
                    savingsAccounts[b-1].withdraw();
                    break;

                }
                case 3:{
                    System.out.println("Enter the Account num: ");
                    int b=scanner.nextInt();
                    System.out.println(savingsAccounts[b-1].balance);
                    break;
                }
                case 4:{
                    System.out.println("Enter the Account num: ");
                    int b=scanner.nextInt();
                    currentAccounts[b-1].deposit();
                    break;
                }
                case 5:{
                    System.out.println("Enter the Account num: ");
                    int b=scanner.nextInt();
                    currentAccounts[b-1].withdraw();
                    break;
                }
                case 6:{
                    System.out.println("Enter the Account num: ");
                    int b=scanner.nextInt();
                    System.out.println(currentAccounts[b-1].balance);
                    break;
                }
                case 7:{
                    System.out.println("thank you ");
                   break;
                }
            }




        }while(choice!=7);
    }
}

