import java.util.Scanner;
public class Calc {
    public static void main(String args[]){
        int a,b,c;
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=a-1;
        c=a+1;
        System.out.println("The next number for the number "+a+" is "+c+".");
        System.out.println("The previous number for the number "+a+" is "+b+".");
    }
}