import java.util.Scanner;
 
public class Cikl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=1;i<=a;i++){
            int j=(int)Math.sqrt(i);
            if(j*j==i){
                System.out.println(i);
            }
        }
 
    }
}