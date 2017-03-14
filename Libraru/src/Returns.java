/**
 * Created by Ajaaz on 3/13/2017.
 *

    100-name
    110-student id
    120-no. of books issues
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
public class Returns implements LibraryInterface {
    Returns(){
        arg[1][0][0]="nerd";
        arg[1][1][0]="160415733";
        arg[1][2][0]="3";
        arg[0][0][0]="31012017";
        arg[0][1][0]="03012017";
        arg[0][2][0]="10022017";
        arg[2][0][0]="Head first with java";
        arg[2][1][0]="let us c";
        arg[2][2][0]="9051";
        arg[0][0][1]="5130";
        arg[1][0][1]="4376";
        arg[2][0][1]="8525";
    }

    protected static String[][][] arg = new String[3][3][2];
    public void searchByBook(String book){
        int i;
        for(i=0;i<3;i++){
           if(arg[i][0][1].equals(book))
                System.out.println("issue no: "+(i+1)+"         Name of book: "+arg[2][i][0]+"          by id: "+arg[1][1][0]+"        Name of Student: "+arg[1][0][0]);
            else if (i==3)
                System.out.println("No more books to show ");
        }
    }

    public void searchByID(String id) {
        int i;
        if (arg[1][1][0].equals(id))
            for (i = 0; i < 3; i++) {
                System.out.println("issue no: " + (i + 1) + "         Name of book: " + arg[2][i][0] + "          by id: " + arg[1][1][0] + "        Name of Student: " + arg[1][0][0]);

            }
    }

    public void searchByDate(String date) {
        int i;
        for(i=0;i<3;i++){
            if(arg[0][i][0].equals(date))
                System.out.println("issue no: "+(i+1)+"         Name of book: "+arg[2][i][0]+"          by id: "+arg[1][1][0]+"        Name of Student: "+arg[1][0][0]);
            else if (i==3)
                System.out.println("No more books to show ");
        }

    }


    public void mainmenu(){
        System.out.println("1.Search by book\n2.Search by Student id\n 3.Search by date of issue\n4. exit  ");
        int n=2;
        switch (n){
            case 1:
                System.out.println("Enter the book ID ");
                String bookid="9051";
                searchByBook(bookid);
                break;
            case 2:
                System.out.println("Enter the Student ID ");
                String id="160415733";
                searchByID(id);
                break;
            case 3:
                System.out.println("Enter the book ID ");
                String date="9051";
                searchByBook(date);
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
