import java.util.Scanner;
 
public class Operatotif {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a%4==0) {
            if(a%400==0){
                System.out.println("YES");
            }
            else if (a % 100 == 0) {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        else{
            System.out.println("NO");
        }
 
    }
}