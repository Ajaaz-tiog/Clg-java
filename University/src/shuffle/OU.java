/**
 * Created by Ajaaz on 3/27/2017.
 */
package shuffle;
public class OU extends Abstract{
    int cmax,imax,emax,eemax,mmax,rank=1100;
    OU(){
       cmax=1000;
       mmax=1200;
       eemax=1333;
       emax=1852;
       imax=2020;
    }
    public void updater(){
        if(cse(cmax,rank))
            System.exit(0);
        else if(ece(emax,rank))
            System.exit(1);

    }
    public static void main(String[] arg){
        OU o =new OU();
        o.updater();
    }

}
