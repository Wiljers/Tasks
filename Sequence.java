package sequence;
import java.util.Scanner ;
/**
 *
 * @author Саша
 */
public class Sequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int dlina,j=0,k;
        String s = new String();
        s="1";
        String isk = new String();  
        System.out.print("Enter the desired sequence ");
         Scanner in = new Scanner(System.in);
         isk = in.nextLine(); 
         String buf1 = new String();
     // System.out.println(isk);
        dlina= isk.length(); 
        char[] buf = new char[dlina];
      // System.out.println(dlina);
        for (int i=2;i<dlina+1;i++ )
        {
           s=s+i;
        } 
        k=dlina;
        while (true)
        {
              s.getChars(j,k,buf,0); 
             buf1=new String(buf);
         //  System.out.println(buf1);         
              j++;
              k=k+1;
              s=s+k; 
              if(buf1.equals(isk))
                 {
                 System.out.println("The number of the desired sequence "+j); 
                 break;
                 }
             
             }
                  
           
        }
    }
