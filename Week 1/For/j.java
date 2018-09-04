import java.util.Scanner;
 
public class Cikl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int k=0;
        for(int i=0;i<100;i++){
            int a=s.nextInt();
            k=k+a;
        }
        System.out.println(k);
    }
}
 