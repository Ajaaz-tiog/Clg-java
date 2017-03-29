/**
 * Created by Ajaaz on 3/27/2017.
 */
package shuffle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abstract {
    int cmax, imax, emax, eemax, mmax;
    static int rank;
    String clg,fclg,brn,fbrn,rollno;
    boolean notAdmitted=true;
    public boolean cse(int max){
          brn="CSE";
//        System.out.println(max+"    "+rank);
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
            return true;
//            System.exit(0);
        }
        return false;
    }
   public  boolean ece(int max){
         brn="ECE";
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
//            System.exit(1);
        }
        return false;
    }

  public boolean eee(int max){
       brn="ECE";
       if(rank<=max){
           System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
//            System.exit(1);
           return true;
       }
       return false;

   }

    public boolean it(int max){
         brn="IT";
                System.out.println(max+"    "+rank);
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
            return true;
//            System.exit(1);
        }
        return false;
    }
   public  boolean mech(int max){
        String brn="MECH";
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
//            System.exit(1);
            return true;
        }
        return false;
    }
    public void confirmer()throws IOException{
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("To accept this seat enter 1 \nTo reject and continue with counselling enter 0");
        int n=Integer.parseInt(br.readLine());
        if(n==1) {
            notAdmitted = false;
            fclg = clg;
            fbrn = brn;
            System.out.println("Allotment order:\n Alloted college- " + fclg + "\n Alloted branch-" + fbrn);
        }

    }
    public void menu() throws IOException{
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("enter the desired branch\n 1.cse \n2.it\n3.mech\n4.ece\n5. eee");
        int choice=Integer.parseInt(br.readLine());
        switch (choice){
            case 1:
                if(cse(cmax))
                    confirmer();
                break;
            case 2:
                if (it(imax))
                    confirmer();
                break;
            case 3:
                if(mech(mmax))
                    confirmer();
                break;
            case  4:
                if (ece(emax))
                    confirmer();
                break;
            case 5:
                if (eee(eemax))
                    confirmer();
                break;
        }

    }
    public void mainmenu(OU o, MVSR m , DCET d ) throws IOException {
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(isr);
        System.out.println("Enter your hallticket No.");
        rollno=br.readLine();
        if(!(rollno.length()==8)){
            System.out.println("Incorrect Hallticket no.! ");
            System.exit(10);
        }

        System.out.println("Enter Your Rank!!");
        this.rank=Integer.parseInt(br.readLine());
        int i;
        System.out.println("You have 5 chances to get into a college");
        for ( i = 0; i < 5 && notAdmitted; i++) {
            System.out.println("-----------------------------------------------------------------\n 1. OU\n 2. MVSR \n 3. DCET");
            System.out.println("Enter the desired college!!");
            int c = Integer.parseInt(br.readLine());
            switch (c) {
                case 1:
                    o.menu();
                    break;
                case 2:
//                    MVSR m = new MVSR();
                    m.menu();
                    break;
                case 3:
//                    DCET d = new DCET();
                    d.menu();
                    break;

            }
            if (notAdmitted)
                System.out.println("Your appication was not accepted try again!");
        }
        if (i==5 && notAdmitted)
            System.out.println("You were not admitted in any college in this round wait for round 2");
    }

}