/**
 * Created by Ajaaz on 3/27/2017.
 */
package shuffle;
public class Abstract {
    int cmax, imax, emax, eemax, mmax, rank = 1100;
    String clg,fclg,brn,fbrn;
    boolean notAdmitted=true;
    public boolean cse(int max,int rank){
          brn="CSE";
//        System.out.println(max+"    "+rank);
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
            return true;
//            System.exit(0);
        }
        return false;
    }
   public  boolean ece(int max,int rank){
         brn="ECE";
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
//            System.exit(1);
        }
        return false;
    }

  public boolean eee(int max,int rank){
       brn="ECE";
       if(rank<=max){
           System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
//            System.exit(1);
       }
       return false;

   }

    public boolean it(int max,int rank){
         brn="IT";
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
            return true;
//            System.exit(1);
        }
        return false;
    }
   public  boolean mech(int max,int rank){
        String brn="MECH";
        if(rank<=max){
            System.out.println("Congrats You application was accepted by "+clg+"for branch "+brn);
//            System.exit(1);
        }
        return false;
    }
    public void confirmer(){
        System.out.println("To accept this seat enter 1 \nTo reject and continue with counselling enter 0");
        int n=1;
        if(n==1) {
            notAdmitted = false;
            fclg = clg;
            fbrn = brn;
            System.out.println("Allotment order:\n Alloted college- " + fclg + "\n Alloted branch-" + fbrn);
        }

    }
    public void menu(){
        System.out.println("enter the desired branch\n 1.cse \n2.it\n3.mech\n4.ece\n5. eee");
        int choice=1;
        switch (choice){
            case 1:
                if(cse(cmax,rank))
                    confirmer();
                break;
            case 2:
                if (it(imax,rank))
                    confirmer();
                break;
            case 3:
                if(mech(mmax,rank))
                    confirmer();
                break;
            case  4:
                if (ece(emax,rank))
                    confirmer();
                break;
            case 5:
                if (eee(eemax,rank))
                    confirmer();
                break;
        }

    }
    public void mainmenu(OU o, MVSR m , DCET d ) {
        int i;
        System.out.println("You have 5 chances to get into a college\n 1. OU\n 2. MVSR \n 3. DCET");
        for ( i = 0; i < 5 && notAdmitted; i++) {
            int c = 3;
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
        }
        if (i==5 && notAdmitted)
            System.out.println("You were not admitted in any college in this round wait for round 2");
    }

}