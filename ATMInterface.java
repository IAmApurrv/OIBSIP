import java.util.Scanner;

// Transaction class to represent individual transactions
class Transaction {
    private String type;
    private double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

// User class to represent ATM user
class User {
    private String userId;
    private String pin;

    public User(String userId, String pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public String getUserId() {
        return userId;
    }

    public String getPin() {
        return pin;
    }
}

// ATM class to perform ATM operations
class ATM {
    private User user;
    private double balance;
    private Transaction[] transactions;
    private int transactionCount;

    public ATM(User user) {
        this.user = user;
        this.balance = 0;
        this.transactions = new Transaction[100];
        this.transactionCount = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions[transactionCount++] = new Transaction("Deposit", amount);
        System.out.println("Deposited: RS " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions[transactionCount++] = new Transaction("Withdrawal", amount);
            System.out.println("Withdrawn: RS " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void transfer(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions[transactionCount++] = new Transaction("Transfer", amount);
            System.out.println("Transferred: RS " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void printTransactions() {
        System.out.println("=================================================");
        System.out.println();
        System.out.println("Transaction History:");
        for (int i = 0; i < transactionCount; i++) {
            Transaction transaction = transactions[i];
            System.out.println(transaction.getType() + ": RS " + transaction.getAmount());
        }
    }

    public double getBalance() {
        return balance;
    }
}

// ATMInterface class to interact with the user
public class ATMInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Hardcoded user credentials for simplicity
        User user = new User("apurrv", "apurrv");
        ATM atm = new ATM(user);

        System.out.println("Welcome to ATM");
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        if (userId.equals(user.getUserId()) && pin.equals(user.getPin())) {
            System.out.println("Login successful!");
            boolean quit = false;
            while (!quit) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Transactions History");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Transfer");
                System.out.println("5. Quit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        atm.printTransactions();
                        break;
                    case 2:
                        System.out.println("=================================================");
                        System.out.println();
                        System.out.print("Enter amount to withdraw: RS ");
                        double withdrawAmount = scanner.nextDouble();
                        atm.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("=================================================");
                        System.out.println();
                        System.out.print("Enter amount to deposit: RS ");
                        double depositAmount = scanner.nextDouble();
                        atm.deposit(depositAmount);
                        break;
                    case 4:
                        System.out.println("=================================================");
                        System.out.println();
                        System.out.print("Enter amount to transfer: RS ");
                        double transferAmount = scanner.nextDouble();
                        atm.transfer(transferAmount);
                        break;
                    case 5:
                        System.out.println("=================================================");
                        System.out.println();
                        quit = true;
                        System.out.println("Thank you for using the ATM");
                        break;
                    default:
                        System.out.println("=================================================");
                        System.out.println();
                        System.out.println("Invalid choice");
                }
            }
        } else {
            System.out.println("Invalid credentials. Please try again.");
        }

        scanner.close();
    }
}
