import java.util.Scanner;
 
public class Function {
    public static double min(double a,int b){
        double k=1;
        for(int i=0;i<b;i++){
            k=k*a;
        }
        return k;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        double a;
        int n;
        a=s.nextDouble();
        n=s.nextInt();
        System.out.println(min(a,n));
    }
}