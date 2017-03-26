/**
 * Created by Ajaaz on 3/13/2017.
 */
import Library.*;
import java.io.*;
public class test {
//    test(){
//
//    }
    static void  mainmenu1(Issues o)throws IOException{
        System.out.println("MainMenu\n 1.Returns 2. Issues 3. Exit");
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
//        Returns r =new Returns();
//        Issues o = new Issues();
        int n= Integer.parseInt(b.readLine());
        switch (n){
            case 1:
               o.mainmenu();
               o.searchByID("160415733");
               mainmenu1(o);
               break;
            case 2:


                o.issue();
                o.searchByID("160415733");
                mainmenu1(o);
                break;
            case 3:
                System.exit(2);
                break;
            default:
                System.out.println("Enter valid Choice");
                mainmenu1(o);
                break;
        }
    }
    public static void main(String a[]) throws IOException{
        Issues i = new Issues();
        mainmenu1(i);
    }
}
