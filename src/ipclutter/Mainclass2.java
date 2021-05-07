
package ipclutter;
import java.util.*;

public class Mainclass2 {

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an ip address ");
        String cmdline= sc.next();
        IpCutter ip1 = new IpCutter(cmdline);
        
        ip1.cutter();
        
    }
    
}
