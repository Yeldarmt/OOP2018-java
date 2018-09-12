import java.util.Scanner;

public class Numwords {
    public int a;
    public Numwords(int a){
        this.a = a;
    }
    public static String[] num1=  { "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"};

    public static String[] num2= {"", "", "Twenty", "Thirty", "Forty", "Fifty",
                                               "Sixty", "Seventy", "Eighty", "Ninety"};

    public String inWords(){
        String s="";
        if(a<20){
            s= num1[a];
        }
        else if(a<100){
                s=num2[a/10]+" "+num1[a%10];
        }
        else if(a<1000){
            if(a%100!=0) {
                s = num1[a / 100] + " hundred [and] " + num2[(a / 10) % 10] + " " + num1[a % 10];
            }
            else{
                s = num1[a / 100]+ " hundred ";
            }
        }
        else if(a<10000){
            if(a%100!=0) {
                s = num1[a / 1000] + " thousands " + num1[(a / 100) % 10] + " " + "hundred [and]" + " " + num2[(a / 10) % 10] + " " + num1[a % 10];
            }
            else{
                s = num1[a / 1000] + " thousands " + num1[(a / 100) % 10] + " " + "hundred";
            }
        }
         else if(a<100000){
             if(a/1000<20) {
                 if(a%100!=0) {
                     s = num1[a / 1000] + /*" " + num1[(a / 1000) % 10] +*/ " thousands " + num1[(a / 100) % 10] + " " + "hundred [and]" + " " + num2[(a / 10) % 10] + " " + num1[a % 10];
                 }
                 else{
                     s = num1[a / 1000] + /*" " + num1[(a / 1000) % 10] +*/ " thousands " + num1[(a / 100) % 10] + " " + "hundred ";
                 }
             }

             else{
                 if(a%100!=0) {
                     s = num2[a / 10000] + " " + num1[(a / 1000) % 10] + " thousands " + num1[(a / 100) % 10] + " " + "hundred [and]" + " " + num2[(a / 10) % 10] + " " + num1[a % 10];
                 }
                 else{
                     s = num2[a / 10000] + " " + num1[(a / 1000) % 10] + " thousands " + num1[(a / 100) % 10] + " " + "hundred";
                 }
             }
         }
        return s;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Numwords nw = new Numwords(n);
        System.out.println(nw.inWords());
    }
}
