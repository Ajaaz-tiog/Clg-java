/**
 * Created by Ajaaz on 3/13/2017.
 */
import ATM2.*;

import java.io.IOException;

public class AtmExecute {
    public static void main(String a[]) throws IOException{
        Transaction t=new Transaction();
        t.transaction(t.validateCard());


    }
}
