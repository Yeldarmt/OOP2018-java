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
        for(int i=1;i<a-1;i++){
            if(m[i]>m[i-1] && m[i]>m[i+1]){
                k++;
            }
        }
        System.out.println(k);
        /*if(k>0){
            System.out.print("YES");
        }
        else{
            System.out.println("NO");
        }*/
    }
}