import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class InputBuffer  
{ 
    public static void main(String[] args) throws IOException  
    { 
		System.out.println("Hello World");
        //Enter data using BufferReader 
        /*BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String name = reader.readLine(); 
  
        // Printing the read line 
        System.out.println(name); 
        */
		String otherLine = System.console().readLine();
		System.out.println(otherLine);
    } 
} 