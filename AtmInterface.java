 import java.util.Scanner;

public class AtmInterface {
    public static void main(String[] args) {
        
        int balance = 100000, withdraw, deposit;
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                
                System.out.println("Automated Teller Machine");
                System.out.println("Select 1 for withdraw the money");
                System.out.println("Select 2 for deposit the money");
                System.out.println("Select 3 for check the balance");
                System.out.println("Select 4 for the EXit");
                System.out.println("Choose the operation you want to perform :");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Enter Money for the withdraw :");
                        withdraw = sc.nextInt();

                        if (balance>=withdraw) {
                            balance = balance-withdraw;

                            System.out.println("please collect your money");
                        }
                        else{
                            System.out.println("Insufficient balance");
                        }

                        System.out.println("");
                        break;
                    
                        case 2:
                        System.out.println("Enter money for deposit :");
                        deposit = sc.nextInt();

                        balance = balance + deposit;
                        System.out.println("your money has been successfully deposited");
                        System.out.println("");
                        break;

                        case 3:
                        System.out.println("balance :"+balance);
                        System.out.println("");
                        break;

                        case 4:
                        System.exit(0);
                }
            }
        }
    }
}

