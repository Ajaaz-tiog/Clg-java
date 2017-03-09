/**
 * Created by Ajaaz on 3/9/2017.
 */
import infosyspayroll.*;
import java.io.*;
import java.nio.Buffer;

public class paygeneraor {
    public static void main(String arg[])throws IOException{
        InputStreamReader i = new InputStreamReader(System.in);
        BufferedReader b= new BufferedReader(i);
        System.out.println("Date: 09-03-2017\n Select your profession:\n1.CEO\n2.CFO\n3.Project Leader\n4.Project Manager\n5.Team Leader\n6.Team Manager\n7.Engineer");
        int d= Integer.parseInt(b.readLine());
        System.out.println("Enter the no days present!:  ");
        int n = Integer.parseInt(b.readLine());
        switch (d){
            case 1:
                ceo o =new ceo(n);
                o.calc();
                break;
            case 2:
                CFO o2 =new CFO(n);
                o2.calc();
                break;
            case 3:
                ProjectManager o3 =new ProjectManager(n);
                o3.calc();
                break;
            case 4:
                ProjectLead o4 =new ProjectLead(n);
                o4.calc();
                break;
            case 5:
                TeamManager o5 =new TeamManager(n);
                o5.calc();
                break;
            case 6:
                TeamLead o6 =new TeamLead(n);
                o6.calc();
                break;
            case 7:
                Engineer o7 =new Engineer(n);
                o7.calc();
                break;

        }

    }
}
