import java.util.Scanner;
 
public class Apple {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n,k;
        n=scan.nextInt();
        k=scan.nextInt();
        int a= k/n;
        System.out.println(a);
    }
}