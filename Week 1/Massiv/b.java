import java.util.Scanner;
 
public class Massiv {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int[] m=new int[a];
        for(int i=0;i<a;i++){
            m[i]=s.nextInt();
        }
        for(int i=0;i<a;i++){
            if(m[i]%2==0){
                System.out.print(m[i]+" ");
            }
        }
    }
}
