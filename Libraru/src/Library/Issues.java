/**
 * Created by Ajaaz on 3/20/2017.
 */
package Library;
public class Issues extends Returns{
//    Issues(){
//
//    }
 public  void issueUpdater(){
        String book,bookid,date;
        book="irodov";
        bookid="1201";
        date="21032017";
        for (int i = 0; i < 3; i++) {
            if (arg[2][i][0].equals("-")) {
                arg[2][i][0]=book;
                arg[i][0][1]=bookid;
                arg[0][i][0]=date;
                arg[1][2][0]=String.valueOf(Integer.parseInt(arg[1][2][0])+1);
            }
        }
    }
   public void issue() {
        String rollNo="160415733";
        if(!issuecheck())
            System.exit(6);
        if (arg[1][1][0].equals(rollNo)) {
            issueUpdater();
        }
    }
    public boolean issuecheck(){
        if(arg[1][2][0].equals("3")){
            System.out.println("You have already reached max no. issues!");
            return false;
        }

        return true;
    }
}

