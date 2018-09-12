import java.util.Scanner;

public class Data {
    private double sum;
    private double max;
    public int a;
    private int cnt;
    public Data( ){
        sum=0;
        max=-9999999;
        cnt=0;
    }
    public double GetAverage(){
        return sum/cnt;
    }
    public double GetMax(){
        return max;
    }
    void GetSum(double b){
        sum=sum+b;
        max=Math.max(max,b);
        cnt++;
    }
    public static class Analyzator{
        public Analyzator(){

        }
        public void Print(){
            Scanner scan = new Scanner(System.in);
            Data data = new Data();
            while(true) {
                String s=scan.next();
                if(s.equals("Q"))
                    break;
                double t = Double.parseDouble(s);
                data.GetSum(t);
            }
            System.out.println("Average = " + data.GetAverage());
            System.out.println("Max = " + data.GetMax());

        }
    }
    public static void main(String args[]){
        Analyzator analyzator = new Analyzator();
        analyzator.Print();
        }
}