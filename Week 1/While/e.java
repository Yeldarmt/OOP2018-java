import java.util.Scanner;
 
public class Cikl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int k=0;
        int t=1;
        while(true){
            if(t>=a){
                System.out.println(k);
                break;
            }
            k++;
            t=t*2;
 
        }
        /*for(int i=1;i<=a;i=i*2){
            if(a==i) {
                System.out.println("YES");
                k=1;
                break;
            }
        }
        if(k==0) {
            System.out.println("NO");
        }*/
    }
}