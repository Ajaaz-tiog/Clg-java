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
        int i;
        for(i=0;i<3;i++){
           if(arg[i][0][1].equals(book))
                System.out.println("issue no: "+(i+1)+"         Name of book: "+arg[2][i][0]+"          by id: "+arg[1][1][0]+"        Name of Student: "+arg[1][0][0]);
        }
        if (i==3)
            System.out.println("No more books to show ");
    }

    public void searchByID(String id) {
        int i;
        if (!(arg[1][1][0].equals(id)))
            System.out.println("No ID found!");
        for (i = 0; i < 3; i++) {
                System.out.println("issue no: " + (i + 1) + "         Name of book: " + arg[2][i][0] +"no. ..is ( "+arg[1][2][0]+" )         by id: " + arg[1][1][0] + "        Name of Student: " + arg[1][0][0]);

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
        int i;
        for(i=0;i<3;i++){
            if(arg[0][i][0].equals(date))
                System.out.println("issue no: "+(i+1)+"         Name of book: "+arg[2][i][0]+"          by id: "+arg[1][1][0]+"        Name of Student: "+arg[1][0][0]);
            else if (i==3)
                System.out.println("No more books to show ");
        }

    }

    public void updater(){
        System.out.println("Enter the issue no.!");
        int ret=1-1;
        System.out.println("The date of issue was "+arg[0][ret][0]+"today date is "+currentDate);
        int NoofDays=35;
        double fine = NoofDays*0.50;
        System.out.println("The fine is amount Rupees "+fine);
        arg[1][2][0]=String.valueOf(Integer.parseInt(arg[1][2][0])-1);
        arg[0][ret][0]="-";
        arg[2][ret][0]="-";
        arg[ret][0][1]="-";

    }


    public void mainmenu(){
        System.out.println("1.Search by book\n2.Search by Student id\n3.Search by date of issue\n4. exit  ");
        int n=2;
        switch (n){
            case 1:
                System.out.println("Enter the book ID ");
                String bookid="9051";
                searchByBook(bookid);
                updater();
                break;
            case 2:
                System.out.println("Enter the Student ID ");
                String id="160415733";
                searchByID(id);
                updater();
                break;
            case 3:
                System.out.println("Enter the Date ");
                String date="31012017";
                searchByDate(date);
                updater();
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
