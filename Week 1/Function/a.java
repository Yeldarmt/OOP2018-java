import java.util.Scanner;
 
public class Function {
    public static int min(int a,int b,int c,int d){
       int minn = a;
       minn=Math.min(Math.min(a,b),Math.min(c,d));
       return minn;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a,b,c,d;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        d=s.nextInt();
        System.out.println(min(a,b,c,d));
    }
}