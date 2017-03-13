package ATM;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.text.DateFormat;

/**
 * Created by Ajaaz on 3/11/2017.
 */
public class Transaction extends CardValidation{
    private int denominationGenerator(){
        System.out.println("Enter the denomination\n Enter the no. of 2000 notes ");
        int d2000=5;
        System.out.println("Enter the no. of 500 notes ");
        int d500=0;
        System.out.println("Enter the no. of 100 notes ");
        int d100=0;
        System.out.println("Enter the no. of 50 notes ");
        int d50=0;
        int dtotal=d2000*2000+d500*500+d100*100+d50*50;
        return dtotal;
    }
    public void transaction(boolean v,int n) {
        if (!v)
            System.exit(2);
//        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//        Date dateobj = new Date();
//        while (n==0){
            System.out.println("MainMenu: \n 1. View My Balance \n 2. Withdraw cash \n3. Deposit \n4.Exit");
            switch(n){
                case 1:
                    System.out.println("Your savings balance is "+savings);
                    break;
                case 2:
                    System.out.println("Enter the amount to be withdrawn ..");
                    int withdrawn=10000;
                    savings-=withdrawn;
                    if (denominationGenerator()==withdrawn)
                        System.out.println("The amount withdrawn is "+withdrawn+"\n current balance is "+savings);
                    else
                        System.out.println("Invalid denominations selected!");
                    break;
                case 3:
                    System.out.println("Enter the amount to be deposited!:");
                    int deposit=12000;
                    savings+=deposit;
                    System.out.println("Amount "+deposit+"sucessfully deposited\n Your current balance is "+savings);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter valid Choice....");
                    System.exit(4);
            }
        }

    }
