import java.util.Scanner;
 
public class Cikl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=s.nextInt();
        for(int i=a;i<=b;i++){
            int j=(int)Math.sqrt(i);
            if(j*j==i) {
                System.out.print(i + " ");
            }
        }
    }
}