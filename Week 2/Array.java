import java.util.Scanner;

public class Array {
    public int a;
    public Array(){
    }
    public int Change(int a){
           return a;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Array ar= new Array();
        int k=0;
        int t=0;
        int[] m ={1,2,3};
        int[] n=new int[2*m.length];
        for(int i=0;i<m.length;i++){
            n[k++]=ar.Change(m[i]);
            n[k++]=ar.Change(m[i]);
            t=k;
        }
        for(int i=0;i<t-1;i++){
            System.out.print(n[i]+",");
        }

        System.out.println(n[t-1]);
    }
}