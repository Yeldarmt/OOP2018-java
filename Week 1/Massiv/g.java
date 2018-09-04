import java.util.Scanner;
 
public class Massiv {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int k=0;
        int[] m=new int[a];
        for(int i=0;i<a;i++){
            m[i]=s.nextInt();
        }
        for(int i=a-1;i>=0;i--){
            System.out.print(m[i] + " ");
        }
        //System.out.println(k);
        /*if(k>0){
            System.out.print("YES");
        }
        else{
            System.out.println("NO");
        }*/
    }
}