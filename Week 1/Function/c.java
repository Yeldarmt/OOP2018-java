import java.util.Scanner;
 
public class Function {
    public static boolean _XOR(int a,int b){
        if(a!=b){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int a;
        int b;
        a=s.nextInt();
        b=s.nextInt();
        if(_XOR(a,b)==true){
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }
}
 