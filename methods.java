package Demo;

public class methods {
    public static void main(String[] args) {
     nonReturning();
     int r=returning(3,9);
        System.out.println("This is the summation:"+r+"");
    }
    public static void nonReturning()
    {
        System.out.println("This is not returning anything");
    }
    public static int returning(int a,int b)
    {int c=a+b;
    return c;
    }
}
