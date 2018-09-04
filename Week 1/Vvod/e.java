import java.util.Scanner;
 
public class Byke {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int v,t;
        v=scan.nextInt();
        t=scan.nextInt();
        if(v<0){
            int a1=(109+v*t)%109;
            if(a1<0){
            System.out.println(109+a1);
            }
            else{
                System.out.println(a1);
            }
        }
        else{
            int a2 = (v*t-109)%109;
            System.out.println(a2);
        }
    }
}
 