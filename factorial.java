package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the no:");
        int num=Integer.parseInt(br.readLine());
        for(int i=num-1;i>0;i--)
        {
            num=num*i;
        }
        System.out.println("Factorial of given number is"+num);

    }

}
