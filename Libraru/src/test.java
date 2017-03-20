/**
 * Created by Ajaaz on 3/13/2017.
 */
import Library.*;
import java.io.*;
public class test {
//    test(){
//
//    }
    static void  mainmenu1()throws IOException{
        System.out.println("MainMenu\n 1.Returns 2. Issues 3. Exit");
        InputStreamReader i=new InputStreamReader(System.in);
        BufferedReader b = new BufferedReader(i);
        int n= Integer.parseInt(b.readLine());
        switch (n){
            case 1:
               Returns r =new Returns();
               r.mainmenu();
               mainmenu1();
               break;
            case 2:
                Issues o = new Issues();
                o.issue();
                mainmenu1();
                break;
            case 3:
                System.exit(2);
                break;
            default:
                System.out.println("Enter valid Choice");
                mainmenu1();
                break;
        }
    }
    public static void main(String a[]) throws IOException{

        mainmenu1();
    }
}
