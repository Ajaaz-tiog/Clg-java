/**
 * Created by Ajaaz on 3/20/2017.
 */
package Library;

import java.io.BufferedReader;
import java.io.IOException;

public class Issues extends Returns{
//    Issues(){
//
//    }
 public  void issueUpdater(BufferedReader b) throws IOException{
        String book,bookid,date;
        System.out.println("Enter the id of the Book to  be issued");
        bookid=b.readLine();
        book="irodov";
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
   public void issue(BufferedReader b) throws IOException{
        System.out.println("Enter Your Roll number");
        String rollNo=b.readLine();
        if(!issuecheck())
            System.exit(6);
        if (arg[1][1][0].equals(rollNo)) {
            issueUpdater(b);
        }
    }
    public boolean issuecheck(){
        if(Integer.parseInt(arg[1][2][0])==3){
            System.out.println("You have already reached max no. issues!");
            return false;
        }

        return true;
    }
}

