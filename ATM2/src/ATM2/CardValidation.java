package ATM2;
import java.io.*;
public abstract class CardValidation extends atm{
	public boolean validateCard() throws IOException{
	    InputStreamReader i = new InputStreamReader(System.in);
	    BufferedReader b = new BufferedReader(i);
		boolean valid=false;
		System.out.println("WELCOME TO ATM! \n Enter your card! \n (enter card number.......)");
//		cardno=3654999909909032l;
        long cardno= Long.parseLong(b.readLine());
        System.out.println("Enter the pin");
        int pin=Integer.parseInt(b.readLine());
		if(!(pin==keyPin))
			System.exit(9);
		System.out.println("Authenticated!");
		valid=true;
		System.out.println("enter a number between 10 and 99!");
		int o=Integer.parseInt(b.readLine());
//		System.out.println(o);
		if(!(o<100 && o>9))
		    valid= false;
		return valid;
	}
}
