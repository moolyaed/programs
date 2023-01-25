package Demo;

public class pyramid {
    public static void main(String[] args) {
        int count=1;
        for (int i = 10; i>0; i--) {
            for(int j=1;j<=i/2;j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= count; j++) {
                System.out.print("*");
            }
            if(count==10)
            {break;
            }else{
            count++;
            }
            System.out.println();
        }
    }}
