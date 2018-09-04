import java.util.Scanner;
public class Calc {
    public static void main(String args[]){
        int a,b;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        double c= java.lang.Math.sqrt(a*a+b*b);
        System.out.print(c);
    }
}