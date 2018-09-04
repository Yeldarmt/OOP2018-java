import java.util.Scanner;
 
public class Cikl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=0;
 
            for (int i = 1; i <= Math.sqrt(a)-1; i++) {
                if (a % i == 0) {
                    b++;
                }
            }
            if(a%Math.sqrt(a)==0) {
                System.out.println(2 * b+1);
            }
            else{
                System.out.println(2*b);
            }
 
    }
}