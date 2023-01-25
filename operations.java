package Demo;

import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        double x;
        x=Double.parseDouble(sc.nextLine());
        double y=Double.parseDouble(sc.nextLine());
        double ad=addition(x,y);
        double s=subtraction(x,y);
        double m=multiplication(x,y);
        double d=division(x,y);
        double mo=modulus(x,y);
        System.out.println("add"+ad+"sub"+s+"multi"+m+"div"+d+"mod"+mo+" ");
    }
public static double addition(double a,double b)
{double ad=a+b;
    return ad;
}
public static double subtraction(double a,double b)
{double s=a-b;
return s;
}
public static double multiplication(double a,double b)
{double m=a*b;
return m;
}
public static double division(double a,double b)
{double d=a/b;
return d;
}
public static double modulus(double a,double b)
{double mo=a%b;
return mo;
}
}
