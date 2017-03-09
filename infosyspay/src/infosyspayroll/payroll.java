package infosyspayroll;
 public class payroll{
//
     int bp,days;
     double da,hra,ts;
    public void calc(){
       if(days<0)
           System.exit(1);
       da=0.8*bp;
       hra=0.2*bp;
       ts=bp+da+hra;
       ts=(ts/30)*days;
       System.out.println("Your Salary is "+ts);
        }
}