package ATM;
public abstract class atm{
	final long atmCardNo =3654999909909032l;
	protected final int keyPin=9900;
	final  long acNo= 36548908721l;
    float current=0;
    float savings=66000;
	abstract boolean validateCard(long cardno,int pin);
	abstract void transaction(boolean valid,int n);
}