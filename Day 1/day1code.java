import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        double b = scan.nextDouble();
        String c = "";
        scan.nextLine();
        c = scan.nextLine();
        
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+c);
        

        scan.close();
    }
}
