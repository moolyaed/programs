package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string:");
        String str=br.readLine();
        int l=str.length();
        int i,j;
        for(i=0,j=l-1;i<l-1&&j>=0;i++,j--)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                System.out.println("Inputed string is not a palindrome");
                break;
            }
            else {
                System.out.println("Inputed string is a palindrome");
                break;
            }
        }
}}
