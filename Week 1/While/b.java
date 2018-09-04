import java.util.Scanner;
 
public class Cikl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for(int i=2;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
                break;
            }
        }
 
    }
}
