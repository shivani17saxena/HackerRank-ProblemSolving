import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Stairs {

    // Complete the staircase function below.
    static void staircase(int n) {
       /*int k;
        for(int i=0; i<n; i++){
             k =0;
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
                k = j+1;
            }
            while(k<n){
                k++;
                System.out.print("#");
            }
            System.out.println();
        }*/
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if( (i+j) > n ){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
