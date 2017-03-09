package infosyspayroll;
 public class payroll{
     int bp,days;
     double da,hra,ts;
    void calc(){
       da=0.8*bp;
       hra=0.2*bp;
       ts=bp+da+hra;
       System.out.println(ts);
        }
}