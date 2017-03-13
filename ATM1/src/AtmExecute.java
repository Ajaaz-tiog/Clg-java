/**
 * Created by Ajaaz on 3/13/2017.
 */
import ATM.*;

public class AtmExecute {
    public static void main(String a[]){
        Transaction t=new Transaction();
        t.transaction(t.validateCard(3654999909909032l,9900),2);


    }
}
