import java.util.Scanner;
 
public class Operatotif {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if(a==0){
            System.out.println(0);
        }
        else if(a>0){
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }
    }
}
 