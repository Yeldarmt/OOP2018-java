import java.util.Timer;
public class Time {
    public int hour, minute,second;

    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public void add(int a, int b,int c){
        int t1 = a*3600+b*60+c;
        int t2=hour*3600+minute*60+second;
        int t = t1+t2;
        int th=t/3600;
        int tm=(t-th*3600)/60;
        int ts= t-th*3600 -tm*60;
        System.out.println(th+":" +tm+":"+ts);
    }
    public String Convert(int a){
        String l ="";
        if(a<10){
            l = "0"+Integer.toString(a);
        }
        else{
            l = Integer.toString(a);
        }
        return l;
    }
    public String toUniversal(){
        return '"'+Convert(hour)+":"+Convert(minute)+":"+Convert(second)+'"';
    }
    public String toStandard() {
        if (hour >= 12) {
            return '"' + Convert(hour-12) + ":" + Convert(minute) + ":" + Convert(second)+" PM"+'"';
        }
        else{
            return '"'+Convert(hour)+":"+Convert(minute)+":"+Convert(second)+"PM"+'"';
        }
    }
    public static void main(String args[]){
        Time t =new Time(23,5,6);
        System.out.println(t.toUniversal());
        System.out.println(t.toStandard());
        Time t2 = new Time(4,24,33);
        t.add(t2.hour,t2.minute,t2.second);
    }
}
