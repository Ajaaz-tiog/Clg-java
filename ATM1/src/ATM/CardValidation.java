package ATM;

public abstract class CardValidation extends atm{
	boolean validateCard(long cardno, int pin){
		boolean valid=false;
		System.out.println("WELCOME TO ATM! \n Enter your card! \n (enter card number.......)");
		cardno=3654999909909032l;
		pin=9900;
		System.out.println(cardno);
		System.out.println("Authenticated!");
		valid=true;
		System.out.println("enter a number between 10 and 99!");
		int o=11;
		System.out.println(o);
		if(!(o<100 && o>9))
		    valid= false;
		return valid;
		
	}
}
