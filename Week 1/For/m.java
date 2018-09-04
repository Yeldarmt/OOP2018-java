import java.util.Scanner;
 
public class Cikl {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int c=s.nextInt();
        int k=0;
        for(int i=0;i<c;i++){
            int a=s.nextInt();
            if(a==0) {
                k++;
            }
        }
        System.out.println(k);
    }
}