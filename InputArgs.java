import java.io.*;

public class InputArgs{
	public static void main(String[] args){
		//if(args.length > 0){
			System.out.println("The arguments on command line are :");
			
			for(String s: args)
			{
				System.out.println(s);
			}
			
			System.out.println("The above were the arguments");
		//}
		/*else{
			System.out.println("No Arguments to display");
		}*/
	}
}