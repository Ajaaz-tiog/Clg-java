package ATM;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.text.DateFormat;

/**
 * Created by Ajaaz on 3/11/2017.
 */
public class Transaction extends CardValidation{
    public void tranction(boolean v,int n) {
        if (!v)
            System.exit(2);
//        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//        Date dateobj = new Date();
        while (n!=4){
            System.out.println("MainMenu: \n 1. View My Balance \n 2. Withdraw cash 3. Deposit 4.Exit");
            switch(n){
                case 1:
                    System.out.println("Your savings balance is "+savings);
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn ..");
                    int withdrawn=10000;
                    savings-=withdrawn;
                    System.out.println("Enter the denomination");
                    System.out.println("The amount withdrawn is "+withdrawn+"\n /current balance is "+savings);
                    break;
                case 3:


            }
        }

    }
}