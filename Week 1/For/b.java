import java.util.Scanner;
 
public class Cikl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        for(int i=a;i<=b;i++){
            if(i%d==c){
                System.out.print(i+" ");
            }
        }
    }
}
 