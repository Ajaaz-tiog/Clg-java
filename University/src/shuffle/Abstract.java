/**
 * Created by Ajaaz on 3/27/2017.
 */
package shuffle;
public class Abstract {
    String clg;
    public boolean cse(int max,int rank){
         String brn="CSE";
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
//            System.exit(0);
        }
        return false;
    }
    boolean ece(int max,int rank){
        String brn="ECE";
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
//            System.exit(1);
        }
        return false;
    }

//    abstract boolean eee(int max,int rank);
//    abstract boolean it(int max,int rank);
//    abstract boolean mech(int max,int rank);
}
