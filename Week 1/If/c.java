import java.util.Scanner;
 
public class Operatotif {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=s.nextInt();
        if((a==1) && b==1 || a!=1 && b!=1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}