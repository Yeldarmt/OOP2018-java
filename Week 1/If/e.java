import java.util.Scanner;
 
public class Operatotif {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b= s.nextInt();
        if(a>b){
            System.out.println(1);
        }
        else if(a<b){
            System.out.println(2);
        }
        else{
            System.out.println(0);
        }
    }
}