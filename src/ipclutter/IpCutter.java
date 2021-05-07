
package ipclutter;

public class IpCutter {
    
    private String cmdline;

    public IpCutter(String cmd) {
       this.cmdline = cmd;
        
    }
    
    public void cutter() {
        
        String [] parts = cmdline.split("\\."); 
        if (parts.length == 4) {
            
            for (int i=0;i<parts.length;i++){
            
                System.out.println(Integer.parseInt(parts[i]));
                
            }

        }
        else {
            System.out.println("Invalid ip address,please enter a valid one");
        }
    }
    
    
    
}
