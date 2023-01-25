package Demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class consoleInput {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Marks");
        String str=br.readLine();
        char b=str.charAt(0);
        int s=23;
        System.out.println(s);
       // char a=Character.parseChar(br.readLine());
      //  int maths = Integer.parseInt(br.readLine());
        //int physics = Integer.parseInt(br.readLine());
        //int Chemistry = Integer.parseInt(br.readLine());
        //int totalperc = (maths + physics + Chemistry) / 3;
        //if (maths >= 35 && physics >= 35 && Chemistry >= 35 && totalperc >= 40) {
          //  System.out.println("pass");
        //} else {
          //  System.out.println("Fail");
        //}
        System.out.println(b);}
}
