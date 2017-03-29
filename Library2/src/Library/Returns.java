/**
 * Created by Ajaaz on 3/13/2017.
 *  Note: ******** Comments are not bullshit pls read them! *********
 *   the following are   indexes of 3d string array 'arg' which represent respective things

 *   100-name
 *   110-student id
 *   120-no. of books issues
 *   000-date1
 *   010-date2
 *   020-date3
 *   200-book1
 *   210-book2
 *   220-book3
 *  001-book id 1
 *  101-book id 2
 *  201-book id 3
 *
* */
//import java.util.*;
package Library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Returns implements LibraryInterface {
    int currentDate=17032017;
public    Returns(){
        arg[1][0][0]="nerd";
        arg[1][1][0]="160415733";
        arg[1][2][0]="3";
        arg[0][0][0]="31012017";
        arg[0][1][0]="03012017";
        arg[0][2][0]="10022017";
        arg[2][0][0]="Head first with java";
        arg[2][1][0]="let us c";
        arg[2][2][0]="HC verma";
        arg[0][0][1]="5130";
        arg[1][0][1]="9051";
        arg[2][0][1]="8525";
    }

    protected static String[][][] arg = new String[3][3][2];
    public void searchByBook(String book){
        int i,check=-1;
        for(i=0;i<3;i++){
           if(arg[i][0][1].equals(book)) {
               System.out.println("issue no: " + (i + 1) + "         Name of book: " + arg[2][i][0] + "          by id: " + arg[1][1][0] + "        Name of Student: " + arg[1][0][0]);
               check++;
           }
        }
        if (check==-1) {
            System.out.println("No more books to show ");
            System.exit(8);
        }
    }

    public void searchByID(String id) {
        int i;
        if (!(arg[1][1][0].equals(id)))
            System.out.println("No ID found!");
        for (i = 0; i < 3; i++) {
                if(!(arg[0][i][0].equals("-")))
                    System.out.println("issue no: " + (i + 1) + "         Name of book: " + arg[2][i][0] +"         by id: " + arg[1][1][0] + "        Name of Student: " + arg[1][0][0]);

            }
    }

//    public int getDifferenceDays(Date d1, Date d2) {
//        int daysdiff=0;
//        long diff = d2.getTime() - d1.getTime();
//        long diffDays = diff / (24 * 60 * 60 * 1000)+1;
//        daysdiff = (int) diffDays;
//        return daysdiff;
//    }

    public void searchByDate(String date) {
        int check = -1, i;
        for (i = 0; i < 3; i++) {
            if (arg[0][i][0].equals(date)) {
                check++;
                System.out.println("issue no: " + (i + 1) + "         Name of book: " + arg[2][i][0] + "          by id: " + arg[1][1][0] + "        Name of Student: " + arg[1][0][0]);
            } else if (check == -1) {
                System.out.println("No books to show ");
                System.exit(8);
            }
        }
    }
    public void updater(BufferedReader b) throws IOException{
        if(arg[1][2][0].equals("0")) {
            System.out.println("No books to return!!");
            System.exit(9);
        }
        System.out.println("Enter the issue no.!");
        int ret=Integer.parseInt(b.readLine())-1;
        System.out.println("The date of issue was "+arg[0][ret][0]+"today date is "+currentDate);
        int NoofDays=Integer.parseInt(b.readLine());
        double fine = NoofDays*0.50;
        System.out.println("The fine is amount Rupees "+fine);
        arg[1][2][0]=String.valueOf(Integer.parseInt(arg[1][2][0])-1);
        arg[0][ret][0]="-";
        arg[2][ret][0]="-";
        arg[ret][0][1]="-";

    }


    public void mainmenu() throws IOException{
        System.out.println("1.Search by book\n2.Search by Student id\n3.Search by date of issue\n4. exit  ");
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
        int n=Integer.parseInt(b.readLine());
        switch (n){
            case 1:
                System.out.println("Enter the book ID ");
                String bookid=b.readLine();
                searchByBook(bookid);
                updater(b);
                break;
            case 2:
                System.out.println("Enter the Student ID ");
                String id=b.readLine();
                searchByID(id);
                updater(b);
                break;
            case 3:
                System.out.println("Enter the Date(DDMMYYYY) ");
                String date=b.readLine();
                searchByDate(date);
                updater(b);
                break;
            case 4:
                System.exit(2);
                break;
            default:
                System.out.println("Enter valid Choice");
                mainmenu();
                break;
        }
    }
}
