import java.util.Scanner;

public class ATMinterface {
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        float balance, withdrawal, deposit;
        int option;
        
        balance= 15000;

        do{
            System.out.println("----Welcome to ATM Machine----\n");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Deposit Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");

            System.out.print("\nEnter your choice: ");
            option= sc.nextInt();
            System.out.println("\n");

            switch(option){

                case 1:
                    System.out.print("Enter amount you want to withdraw: ");
                    withdrawal= sc.nextFloat();
                    
                    if (withdrawal <= balance){

                        System.out.println("Withdrawal successful!\n\n");
                        balance-= withdrawal;
                        break;
                    }
                    else{
                        System.out.println("Insufficient Balance!\n\n");
                        break;
                    }

                case 2:
                    System.out.print("Enter amount you want to deposit: ");
                    deposit= sc.nextFloat();
                    System.out.println("Deposit successful!\n\n");
                    balance+= deposit;
                    break;

                case 3:
                    System.out.print("Your current balance amount is: " + balance + "\n\n");
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!\n");
                    break; 

                default :
                    System.out.println("Invalid option! Please select 1-4.\n\n");
        }

        
        
        }
        while(option!=4);

        sc.close();

    }
    
}