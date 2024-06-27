import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0;i<t;i++){
            String s = scanner.next();
            String even_string = "";
            String odd_string  = "";
            
            for (int j = 0;j<s.length();j++){
                if(j%2==0){
                    even_string = even_string+s.charAt(j);
                }
                else {
                    odd_string = odd_string+s.charAt(j);
                }
            }
            System.out.println(even_string+" "+odd_string);
         }
        
    }
}
